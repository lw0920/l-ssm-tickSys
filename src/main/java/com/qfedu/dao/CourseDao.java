package com.qfedu.dao;

import com.qfedu.pojo.Course;

import java.util.List;

/**
 * Created by Administrator on 2019/6/13.
 */
public interface CourseDao {
    public List<Course> findCourse();

    public List<Course> findAll();

    public void update(Course course);

    public void delete(Integer id);

    public void add(Course course);
}
