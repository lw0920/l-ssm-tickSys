package com.qfedu.controller;

import com.qfedu.pojo.Authority;
import com.qfedu.pojo.LoginLog;
import com.qfedu.service.UserService;
import com.qfedu.utils.GetIpAddressByIp;
import com.qfedu.utils.GetIpUtils;
import com.qfedu.utils.MD5Utils;
import com.qfedu.vo.JsonBean;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/6/16.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;
    //登录验证

    @RequestMapping("login.do")
    public String loginValidate(String no, String pass, HttpServletRequest request){
        pass= MD5Utils.getMD5String(pass);
        UsernamePasswordToken token = new UsernamePasswordToken(no,pass);
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(token);

            String ip = GetIpUtils.getIpAddress(request);
            System.out.println(request);
            String address = GetIpAddressByIp.getIpAddressByIp(ip);
            System.out.println(ip+address+".......................");
            LoginLog loginLog = new LoginLog();
            loginLog.setIp(ip);
            loginLog.setLocation(address);
            loginLog.setNo(no);
            userService.insertLoginLog(loginLog);

            return "redirect:/index.html";
        } catch (AuthenticationException e) {
            e.printStackTrace();
            return "redirect:/login.html";
        }
    }

    //员工获取列表
    @RequestMapping("/usermenu.do")
    @ResponseBody
    public List<Authority> menu(){
        String name=(String)SecurityUtils.getSubject().getPrincipal();
        // 获取登录后的合法的用户名
       // System.out.println(name+".............................");
        List<Authority> allMenu = userService.findAllMenu(name);
        return  allMenu;
    }

    //个人登录日志
    @RequestMapping("/loginloglist.do")
    @ResponseBody
    public Map<String, Object> loginLogList(Integer page,Integer limit){
        String name=(String)SecurityUtils.getSubject().getPrincipal();
        Map map = userService.findAllLoginLogByPage(name, page, limit);
        return map;
    }

    //所有登陆人员
    @RequestMapping("/userall.do")
    @ResponseBody
    public Map<String, Object> loginLogList(Integer page, Integer limit, String no, Integer flag){
        Map map = userService.findAllUser(page, limit, no, flag);

        return map;
    }

    @RequestMapping("/userdel.do")
    @ResponseBody
    public JsonBean delUser(Integer id){
        userService.delUser(id);

        return new JsonBean(1000,null);
    }

    @RequestMapping("/rolepage.do")
    @ResponseBody
    public Map roleFindByPage(Integer page, Integer limit, String no,Integer flag){
        Map map= userService.findAllRoleByPage(page,limit,no,flag);

        return map;
    }

}