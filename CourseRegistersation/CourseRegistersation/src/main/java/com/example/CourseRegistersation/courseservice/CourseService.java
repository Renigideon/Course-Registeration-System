package com.example.CourseRegistersation.courseservice;

import com.example.CourseRegistersation.coursemodel.Course;
import com.example.CourseRegistersation.coursemodel.CourseRegistry;
import com.example.CourseRegistersation.courserespo.Courseregrespo;
import com.example.CourseRegistersation.courserespo.Courserespo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class CourseService {
@Autowired
private Courserespo cr;
@Autowired
private Courseregrespo crr;
    public List<Course> getcourses() {
        return cr.findAll();
    }

    public List<CourseRegistry> courseenrolled() {
        return crr.findAll();
    }
    public void register_course(String name,String email,String Course){
        CourseRegistry cr=new CourseRegistry(name,email,Course);
        crr.save(cr);

    }
}
