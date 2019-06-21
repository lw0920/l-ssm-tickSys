package com.qfedu.service;

import com.qfedu.pojo.Course;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/6/14.
 */
public interface CourseService {
    public List<Course> findCourse();

    public Map<String,Object> findAllByPage(Integer page, Integer limit);

    public void updateCourse(Course course);

    public void deleteCourseById(Integer id);

    public void addCourse(Course course);
}
