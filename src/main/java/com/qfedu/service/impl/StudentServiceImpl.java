package com.qfedu.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.dao.StudentDao;
import com.qfedu.pojo.Grade;
import com.qfedu.pojo.Staff;
import com.qfedu.pojo.Student;
import com.qfedu.service.StudentService;
import org.apache.xmlbeans.impl.xb.xsdschema.All;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/6/14.
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired(required = false)
    private StudentDao studentDao;

    // 调用该方法进行分页查询
    // 第一个参数：页码；第二个参数：每页显示的记录数
    // startPage语句后，一定要紧跟着查询的相关方法
    @Override
    public Map<String,Object> findAllByPage(Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        List<Student> list = studentDao.findAll();

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
    public void addStudent(Student student) {
        studentDao.addStudent(student);
    }

    @Override
    public void deleteStudentById(String no) {
        studentDao.deleteStudentById(no);
    }


}
