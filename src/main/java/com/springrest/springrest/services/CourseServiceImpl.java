package com.springrest.springrest.services;
import java.util.*;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.*;

@Service
public class CourseServiceImpl implements CourseService {

    // List<Course> list;
    @Autowired
    private CourseDao CourseDao;

    public CourseServiceImpl(){
        // list = new ArrayList<>();
        // list.add(new Course(145, "Java Core","Java Core Course"));
        // list.add(new Course(150, "Spring Core","Spring-Java Core Course"));

    }
    @Override
    public List<Course> getCourse(){
        // return list;
        return CourseDao.findAll();
    }

    @Override
    public Course getCourse(long courseId){
        // Course c = null;
        // for(Course course:list){
        //    if(course.getId()==courseId){
        //     c = course;
        //     break;
        //    } 
        // }
        return CourseDao.getOne(courseId);
    }
    @Override
    public List<Course> addCourse(Course course) {
        // list.add(course);
        CourseDao.save(course);
        return CourseDao.findAll();
    }
    @Override
    public Course updateCourse(Course course) {
        // list.forEach(e -> {
        //     if(e.getId()==course.getId()){
        //         e.setTitle(course.getTitle());
        //         e.setDescription(course.getDescription());
        //     }
        // });
        CourseDao.save(course);
        return course;
    }
    @Override
    public void deleteCourse(long courseId) {
        // list = this.list.stream().filter(e->e.getId()!=courseId).collect(Collectors.toList());
        Course entity = CourseDao.getOne(courseId);
        CourseDao.delete(entity);
    }
}
