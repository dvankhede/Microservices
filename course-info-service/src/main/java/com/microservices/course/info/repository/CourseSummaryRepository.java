package com.microservices.course.info.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.course.info.models.CourseSummary;

@Repository
public interface CourseSummaryRepository extends JpaRepository<CourseSummary,Long> {

}
