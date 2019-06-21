package com.qfedu.controller;

import com.qfedu.pojo.Depart;
import com.qfedu.service.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2019/6/14.
 */
@Controller
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
}
