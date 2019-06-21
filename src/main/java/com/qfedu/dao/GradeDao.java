package com.qfedu.dao;

import com.qfedu.pojo.Grade;

import java.util.List;

/**
 * Created by Administrator on 2019/6/13.
 */
public interface GradeDao {
    public List<Grade> findGrade();

    public List<Grade> findAll();

    public void update(Grade grade);

    public void delete(Integer id);

    public void add(Grade grade);
}
