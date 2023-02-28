package com.springrest.springrest.services;
import java.util.*;
import com.springrest.springrest.entities.*;
public interface CourseService {
    public List<Course> getCourse();
    public Course getCourse(long courseId);
    public List<Course> addCourse(Course course);
    public Course updateCourse(Course course);
}
