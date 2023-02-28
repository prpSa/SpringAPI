package com.springrest.springrest.services;
import java.util.*;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.*;

@Service
public class CourseServiceImpl implements CourseService {

    List<Course> list;

    public CourseServiceImpl(){
        list = new ArrayList<>();
        list.add(new Course(145, "Java Core","Java Core Course"));
        list.add(new Course(150, "Spring Core","Spring-Java Core Course"));
    }
    @Override
    public List<Course> getCourse(){
        return list;
    }

    @Override
    public Course getCourse(long courseId){
        Course c = null;
        for(Course course:list){
           if(course.getId()==courseId){
            c = course;
            break;
           } 
        }
        return c;
    }
    @Override
    public List<Course> addCourse(Course course) {
        list.add(course);
        return list;
    }
    @Override
    public Course updateCourse(Course course) {
        list.forEach(e -> {
            if(e.getId()==course.getId()){
                e.setTitle(course.getTitle());
                e.setDescription(course.getDescription());
            }
        });
        return course;
    }
}
