package com.microservices.mark.data.resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.mark.data.models.Marks;
import com.microservices.mark.data.models.StudentMarks;

@RestController
@RequestMapping("/marksdata")
public class MarksResource {
	
    @RequestMapping("/courses/{courseId}")
    public Marks getCourseRating(@PathVariable("movieId") String courseId) {
        return new Marks(courseId, 4);
    }

    @RequestMapping("/student/{studentId}")
    public StudentMarks getUserMarks(@PathVariable("studentId") String studentId) {
    	StudentMarks studentMarks = new StudentMarks();
    	studentMarks.initData(studentId);
        return studentMarks;

    }

}
