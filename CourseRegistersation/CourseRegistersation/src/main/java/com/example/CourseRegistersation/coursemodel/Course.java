package com.example.CourseRegistersation.coursemodel;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
    @Id
    private String course_id;
    private String course_name;
    private String Trainer;
    private int traininginweeks;

    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getTrainer() {
        return Trainer;
    }

    public void setTrainer(String trainer) {
        Trainer = trainer;
    }

    public int getTraininginweeks() {
        return traininginweeks;
    }

    public void setTraininginweeks(int traininginweeks) {
        this.traininginweeks = traininginweeks;
    }
}
