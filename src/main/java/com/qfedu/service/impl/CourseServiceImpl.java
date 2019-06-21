package com.qfedu.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.dao.CourseDao;
import com.qfedu.pojo.Course;
import com.qfedu.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/6/14.
 */
@Service
public class CourseServiceImpl implements CourseService {
    @Autowired(required = false)
    private CourseDao courseDao;

    @Override
    public List<Course> findCourse() {
        List<Course> Allcourse = courseDao.findCourse();
        return Allcourse;
    }

    @Override
    public Map<String, Object> findAllByPage(Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        List<Course> list = courseDao.findAll();

        long total = ((Page) list).getTotal();// 获取总记录数
        int pages = ((Page) list).getPages();// 获取总页数

        Map<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", total);
        map.put("data", list);
        return map;
    }

    @Override
    public void updateCourse(Course course) {
        courseDao.update(course);
    }

    @Override
    public void deleteCourseById(Integer id) {
        courseDao.delete(id);

    }

    @Override
    public void addCourse(Course course) {
        courseDao.add(course);
    }
}
