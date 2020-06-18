package com.nokia.app.school_admin_demo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Student implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = -40055975279900220L;


    @Id
    private Integer studentId; 
    private String studentName; 

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    public Integer getStudentId(){
        return this.studentId;
    }

    public String getStudentName(){
        return this.studentName;
    }

    public void setStudentId(Integer studentId){
        this.studentId = studentId;
    }

    public void setStudentName(String studentName){
        this.studentName = studentName;
    }

    public Course getCourse(){
        return this.course;
    }

    public void setCourse(Course course){
        this.course = course;
    }


}