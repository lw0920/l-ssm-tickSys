package com.qfedu.service;

import com.qfedu.pojo.Grade;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/6/14.
 */

public interface GradeService {
    public List<Grade> findGrade();

    public Map<String,Object> findAllByPage(Integer page, Integer limit);

    public void updateGrade(Grade grade);

    public void deleteGradeById(Integer id);

    public void addGrade(Grade grade);
}
