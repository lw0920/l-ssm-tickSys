package com.qfedu.controller;

import com.qfedu.pojo.Grade;
import com.qfedu.service.GradeService;
import com.qfedu.vo.JsonBean;
import org.apache.ibatis.cache.NullCacheKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/6/14.
 */
@Controller
public class GradeController {
    @Autowired(required = false)
    private GradeService gradeService;

    @RequestMapping("/gradeall.do")
    @ResponseBody
    public List<Grade> findGrade(){
        List<Grade> grades = gradeService.findGrade();
        System.out.println(grades.size());
        return grades;
    }

    @RequestMapping("/gradepage.do")
    @ResponseBody
    public Map findAll(Integer page, Integer limit){
        Map<String,Object> map=gradeService.findAllByPage(page,limit);
        System.out.println(map.size());
        System.out.println(map.get("list"));
        System.out.println(page+"------------"+limit);
        return map;
    }

    @RequestMapping("/gradeupdate.do")
    @ResponseBody
    public JsonBean updateGrade(Grade grade){
        gradeService.updateGrade(grade);
        return new JsonBean(1,null);
    }

    @RequestMapping("/gradedelete.do")
    @ResponseBody
    public JsonBean deleteGradeById(Integer id){
        gradeService.deleteGradeById(id);
        return new JsonBean(1000, null);
    }

    @RequestMapping("/gradeadd.do")
    @ResponseBody
    public JsonBean addGrade(Grade grade){
        gradeService.addGrade(grade);
        return new JsonBean(1,null);
    }
}
