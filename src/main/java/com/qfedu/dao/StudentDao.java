package com.qfedu.dao;

import com.qfedu.pojo.Grade;
import com.qfedu.pojo.Staff;
import com.qfedu.pojo.Student;

import java.util.List;

/**
 * Created by Administrator on 2019/6/13.
 */
public interface StudentDao {
   public List<Student> findAll();

   public void addStudent(Student student);

   public void deleteStudentById(String no);
}
