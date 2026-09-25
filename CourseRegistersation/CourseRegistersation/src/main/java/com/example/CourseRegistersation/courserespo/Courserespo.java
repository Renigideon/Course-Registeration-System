package com.example.CourseRegistersation.courserespo;

import com.example.CourseRegistersation.coursemodel.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Courserespo extends JpaRepository<Course,String> {
}
