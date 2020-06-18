package com.nokia.app.school_admin_demo.controller;

import java.util.List;

import com.nokia.app.school_admin_demo.model.Student;
import com.nokia.app.school_admin_demo.repo.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired
    StudentRepository studentRepository;
    
    @GetMapping("/api/helloWorld")
    public String helloWorld(){
        return "Hello World!";
    }

    @GetMapping("/api/student")
    public Student getStudent(){
        Student student = new Student();
        student.setStudentId(1);
        student.setStudentName("Professor");
        return student;
    }

    @GetMapping("/api/students")
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    @PostMapping("/api/addStudent")
    public Student addStudent(@RequestBody Student student){
        return studentRepository.save(student);
    }

    @DeleteMapping("/api/{studentId}/deleteStudent")
    public void deleteStudent(@PathVariable("studentId") Integer studentId){
        studentRepository.deleteById(studentId);
    }
}