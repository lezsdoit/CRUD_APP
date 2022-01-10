package com.springrest.springrest.services;

import com.springrest.springrest.entities.Course;

import java.util.List;
import java.util.Optional;

public interface CourseService {
    public List<Course> getAll();
    public Optional<Course> get(long id);
    public Course addCourse(Course course);
    public Course update(Course course);

    public void deleteCourse(long parseLong);
}
