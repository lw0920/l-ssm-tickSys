package com.qfedu.controller;

import com.qfedu.pojo.Course;
import com.qfedu.service.CourseService;
import com.qfedu.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/6/14.
 */
@Controller
public class CourseController {

    @Autowired(required = false)
    private CourseService courseService;

    @RequestMapping("/courseall.do")
    @ResponseBody
    public List<Course> findCourse(){
        List<Course> course = courseService.findCourse();
        System.out.println(course.size());
        return course;
    }

    @RequestMapping("/coursepage.do")
    @ResponseBody
    public Map<String,Object> findAll(Integer page, Integer limit){
        Map<String,Object> map=courseService.findAllByPage(page,limit);
        System.out.println(map.size());
        System.out.println(map.get("list"));
        System.out.println(page+"------------"+limit);
        return map;
    }
// /courseupdate.do /coursedelete.do
    @RequestMapping("/courseupdate.do")
    @ResponseBody
    public JsonBean updateCoruse(Course course){
         courseService.updateCourse(course);
         return new JsonBean(1,null);
}

    @RequestMapping("/coursedelete.do")
    @ResponseBody
    public JsonBean deleteCourseById(Integer id){
        courseService.deleteCourseById(id);
        return new JsonBean(1000, null);
    }

    @RequestMapping("/courseadd.do")
    @ResponseBody
    public JsonBean addCourse(Course course){
        courseService.addCourse(course);
        return new JsonBean(1000,null);
    }

}
