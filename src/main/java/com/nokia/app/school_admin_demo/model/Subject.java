package com.nokia.app.school_admin_demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Subject {
    private static final long serialVersionUID = -40055975279900220L;

    @Id
    private Integer subjectId;
    private String subjectDescription;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    public Integer getSubjectId(){
        return this.subjectId;
    }

    public String getSubjectDescription(){
        return this.subjectDescription;
    }

    public void setSubjectId(Integer subjectId){
        this.subjectId = subjectId;
    }

    public void setSubjectDescription(String description){
        this.subjectDescription = description;
    }

    public Course getSubject(){
        return this.course;
    }

    public void setCourse(Course course){
        this.course = course;
    }

}