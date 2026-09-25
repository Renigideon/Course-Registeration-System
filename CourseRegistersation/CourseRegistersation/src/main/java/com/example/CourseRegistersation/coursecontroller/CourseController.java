package com.example.CourseRegistersation.coursecontroller;

import com.example.CourseRegistersation.coursemodel.Course;
import com.example.CourseRegistersation.coursemodel.CourseRegistry;
import com.example.CourseRegistersation.courseservice.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class CourseController {
    @Autowired
    private CourseService cs;
    @GetMapping("/AvailableCourses")
    public List<Course> getcourses(){
        return cs.getcourses();
    }
    @GetMapping("/AvailableCourses/enrolled")
    public List<CourseRegistry> getcourseregistry(){
        return cs.courseenrolled();
    }
    @PostMapping("/register")
    public String register_course(@RequestParam("name")String name, @RequestParam("email")String email, @RequestParam("Course")String Course){
         cs.register_course(name,email,Course);
         return name+" Successfully Enrolled in the Course of "+Course;
    }
}
