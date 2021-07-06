package com.course.repositories;

import com.course.models.Course;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Component
public class CourseRepository implements iCourseRepository{

    private List<Course> courses;

    public CourseRepository(){
        this.courses = new ArrayList<>();
        this.courses.add(new Course("Java Basics - Niveau 100", "Jan de Vries"));
        this.courses.add(new Course("Java Advanced - Niveau 200", "Bas de Hoop"));

    }

    @Override
    public List<Course> getAllCourses() {
        return courses;
    }

    @Override
    public Course createCourse(Course course) {
        this.courses.add(course);
        return course;
    }
}
