package com.course.controllers;

import com.course.models.Course;
import com.course.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/courses")
public class CourseController {

    CourseRepository courseRepository;

    public CourseController(){}

    @Autowired
    public CourseController(CourseRepository courseRepository){this.courseRepository = courseRepository;};

    @GetMapping("/all")
    public List<Course> getAllCourses(){
        return this.courseRepository.getAllCourses();
    }

    @PostMapping("new")
    public void createCourse(@RequestBody Course newCourse){
        this.courseRepository.createCourse(newCourse);
    }
}
