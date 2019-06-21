package com.qfedu.service;
import com.qfedu.pojo.Grade;
import com.qfedu.pojo.Staff;
import com.qfedu.pojo.Student;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/6/14.
 */
public interface StudentService {

   public Map<String,Object> findAllByPage(Integer page, Integer limit);

   public void addStudent(Student student);

   public void deleteStudentById(String no);

}
