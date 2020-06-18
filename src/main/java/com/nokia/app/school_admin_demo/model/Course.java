package com.nokia.app.school_admin_demo.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Course implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    private Integer courseId; 
    private String courseName;  

    @OneToMany(mappedBy = "course")
    private List<Student> students;

    public Integer getCourseId(){
        return this.courseId;
    }

    public String getCourseName(){
        return this.courseName;
    }

    public void setCourseId(Integer courseId){
        this.courseId = courseId;
    }

    public void setCourseName(String courseName){
        this.courseName = courseName;
    }

    public List<Student> getStudents(){
        return this.students;
    }

    public void setStudents(List<Student> students){
        this.students = students;
    }
    
}