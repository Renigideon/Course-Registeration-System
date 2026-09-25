package com.example.CourseRegistersation.coursemodel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CourseRegistry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cid;
    private String name;
    private String email;
    private String Course;

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String course) {
        Course = course;
    }

    public CourseRegistry( String name, String email, String course) {
        this.name = name;
        this.email = email;
        Course = course;
    }

    public CourseRegistry() {
    }
}
