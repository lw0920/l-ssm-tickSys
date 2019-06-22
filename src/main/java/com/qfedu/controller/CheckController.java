package com.qfedu.controller;

import com.qfedu.pojo.Check;
import com.qfedu.service.CheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by Administrator on 2019/6/20.
 */
@RestController

public class CheckController {

    @Autowired(required = false)
    private CheckService checkService;

    @RequestMapping("/processlist.do")
    public Map processlist(Integer page,Integer limit){
        Map map = checkService.findByPage(page,limit);

        return map;
    }

    @RequestMapping("/processadd.do")
    public void checkProcessAdd(Check check, Integer did){



        System.out.println(check);
        System.out.println(did);
    }

    @RequestMapping("/processecharts.do")
    public void processecharts(Integer pid){

        System.out.println("shayisi");
    }
}