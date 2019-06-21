package com.qfedu.controller;

import com.alibaba.druid.support.spring.stat.SpringStatUtils;
import com.qfedu.pojo.Grade;
import com.qfedu.pojo.Staff;
import com.qfedu.pojo.Student;
import com.qfedu.service.StudentService;
import com.qfedu.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/6/14.
 */
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/studentpage.do")
    public Map findAll(Integer page,Integer limit){
    Map<String,Object> map=studentService.findAllByPage(page,limit);
        System.out.println(map.size());
        System.out.println(map.get("list"));
        System.out.println(page+"------------"+limit);
        return map;
    }

    @RequestMapping("/studentadd.do")
    @ResponseBody
    public JsonBean addStudent(Student student){
        studentService.addStudent(student);
        return new JsonBean(1,null);
    }

    @RequestMapping("/studentdelete.do")
    @ResponseBody
    public JsonBean deleteStudentById(String no){
        studentService.deleteStudentById(no);
        return new JsonBean(1000,null);
    }

}


