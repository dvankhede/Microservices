package com.microservices.student.catalog.resource;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.microservices.student.catalog.models.CatalogItem;
import com.microservices.student.catalog.models.Course;
import com.microservices.student.catalog.models.StudentMarks;

@RestController
@RequestMapping("/catalog")
public class CatalogResource {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    WebClient.Builder webClientBuilder;

    @RequestMapping("/{studentId}")
    public List<CatalogItem> getCatalog(@PathVariable("studentId") String studentId) {

        StudentMarks studentMarks = restTemplate.getForObject("http://marks-data-service/marksdata/student/" + studentId, StudentMarks.class);

        return studentMarks.getMarks().stream()
                .map(marks -> {
                	Course course = restTemplate.getForObject("http://course-info-service/courses/" + marks.getCourseId(), Course.class);
                    return new CatalogItem(course.getName(), course.getDescription(), marks.getMark());
                })
                .collect(Collectors.toList());

    }
}
