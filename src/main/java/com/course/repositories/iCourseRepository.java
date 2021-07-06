package com.course.repositories;

import com.course.models.Course;

import java.util.List;

public interface iCourseRepository {
    List<Course> getAllCourses();
    Course createCourse(Course course);

}
