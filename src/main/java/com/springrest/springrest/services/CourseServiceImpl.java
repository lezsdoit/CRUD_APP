package com.springrest.springrest.services;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    CourseDao courseDao;

    public CourseServiceImpl() {

    }

    @Override
    public List<Course> getAll() {
        return courseDao.findAll();
    }

    @Override
    public Optional<Course> get(long id) {
        System.out.println("inside sevice impl of get by id");
        return  courseDao.findById(id);
    }

    @Override
    public Course addCourse(Course course) {
        courseDao.save(course);
        return course;
    }

    @Override
    public Course update(Course course) {
        courseDao.save(course);
        return course;
    }

    @Override
    public void deleteCourse(long parseLong) {
        Course c = courseDao.getById(parseLong);
        courseDao.delete(c);
    }
}
