package com.nokia.app.school_admin_demo.repo;

import com.nokia.app.school_admin_demo.model.Course;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CourseRepository extends JpaRepository<Course, Integer> {
    
}