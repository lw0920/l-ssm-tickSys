package com.qfedu.controller;

import com.qfedu.utils.GetIpUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2019/6/14.
 */
@Controller
public class testIP {

    @ResponseBody
    @RequestMapping("/testip")
    public String testIp(HttpServletRequest request){
        String ipAddress = GetIpUtils.getIpAddress(request);
        System.out.println(ipAddress);
        return ipAddress;
    }
}