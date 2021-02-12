package com.microservices.course.info.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.course.info.models.Course;
import com.microservices.course.info.models.CourseSummary;
import com.microservices.course.info.repository.CourseSummaryRepository;

@RestController
@RequestMapping("/courses")
public class CourseResource {
		    
	    @Autowired
	    private CourseSummaryRepository courseSummaryRepository;

	    @RequestMapping("/{courseId}")
	    public Course getMovieInfo(@PathVariable("courseId") Long courseId) {
	        CourseSummary courseSummary = courseSummaryRepository.findById(courseId).get();
	        return new Course(courseId.toString(), courseSummary.getTitle(), courseSummary.getOverview());

	    }
}
