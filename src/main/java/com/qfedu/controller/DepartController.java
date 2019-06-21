package com.qfedu.controller;
import java.util.List;
import java.util.Map;
import com.qfedu.pojo.Depart;
import com.qfedu.service.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

import com.qfedu.pojo.Depart;
import com.qfedu.service.DepartService;
import com.qfedu.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.Map;

/**
 * Created by Administrator on 2019/6/14.
 */
@Controller
@ResponseBody
public class DepartController {
    @Autowired(required = false)
    private DepartService departService;

    @RequestMapping("/departall.do")
    @ResponseBody
    public List<Depart> find(){
        List<Depart> departs = departService.find();
        System.out.println(departs.size());
        return departs;
    }

    @Autowired(required = false)
    private DepartService departService;


    @RequestMapping("/departpage.do")

    public Map<String,Object> findAlldepart(Integer page,Integer limit){

        Map map = departService.findAlldepart(page,limit);

        return map;
    }

    @RequestMapping("/departupdate.do")
    public JsonBean departUpdate(Depart depart){
        departService.updateDepart(depart);

        return  new JsonBean(1000,null);
    }


    @RequestMapping("/departdelete.do")
    public JsonBean deleteDepart(Integer id){
        departService.deleteDepart(id);

        return  new JsonBean(1000,null);
    }



    @RequestMapping("/departadd.do")
    public JsonBean addDepart(Depart depart, @DateTimeFormat(pattern = "yyyy-MM-dd")Date createtime){

        System.out.println(createtime+"11111111111111111111111111111111111111111111111111111111");
        depart.setCreateTime(createtime);
        departService.addDepart(depart);
        return  new JsonBean(1000,null);
    }
}
