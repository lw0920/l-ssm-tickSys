package com.qfedu.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.dao.GradeDao;
import com.qfedu.pojo.Grade;
import com.qfedu.pojo.Student;
import com.qfedu.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/6/14.
 */
@Service
public class GradeServiceImpl implements GradeService {
    @Autowired(required = false)
    private GradeDao gradeDao;

    @Override
    public List<Grade> findGrade() {
        List<Grade> Allgrade = gradeDao.findGrade();
        return Allgrade;
    }

    @Override
    public Map<String,Object> findAllByPage(Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        List<Grade> list = gradeDao.findAll();

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
    public void updateGrade(Grade grade) {
        gradeDao.update(grade);
    }

    @Override
    public void deleteGradeById(Integer id) {
        gradeDao.delete(id);

    }

    @Override
    public void addGrade(Grade grade) {
        gradeDao.add(grade);
    }

}
