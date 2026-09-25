package com.example.CourseRegistersation.courserespo;

import com.example.CourseRegistersation.coursemodel.CourseRegistry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Courseregrespo extends JpaRepository<CourseRegistry,Integer> {
}
