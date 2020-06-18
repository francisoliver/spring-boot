package com.nokia.app.school_admin_demo.controller;

import java.util.List;

import com.nokia.app.school_admin_demo.model.Course;
import com.nokia.app.school_admin_demo.repo.CourseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CourseController {
    @Autowired
    CourseRepository courseRepository;

    @GetMapping("/api/courses")
    public List<Course> getAllCourses(){
        return courseRepository.findAll();
    }

    @PostMapping("/api/addCourse")
    public Course addCourse(@RequestBody Course course){
        return courseRepository.save(course);
    }

    @DeleteMapping("/api/{courseId}/deleteCourse")
    public void deleteCourse(@PathVariable("courseId") Integer courseId){
        courseRepository.deleteById(courseId);
    }

}