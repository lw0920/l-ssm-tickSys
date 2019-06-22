package com.qfedu.controller;

import com.qfedu.pojo.Authority;
import com.qfedu.pojo.Role;
import com.qfedu.service.AuthorityService;
import com.qfedu.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/6/19.
 */

@Controller
public class AuthorityController {


    @Autowired
    private AuthorityService authorityService;

    //所有登陆人员
    @RequestMapping("/roleall.do")
    @ResponseBody
    public List<Role> findAllRole(){

        List<Role> list =  authorityService.finallrole();
 //       System.out.println(list.size());
        return list;
    }

    @RequestMapping("/userroleedit.do")
    @ResponseBody
    public JsonBean userRoleEdit(Integer id, Integer[] rids){
       /* System.out.println("11111111111111111111111111111111111111///////////////////+"+id);
        System.out.println(rids[0]);*/
        authorityService.insertRoleById(id,rids);

        return new JsonBean(1000,null);
    }
    @RequestMapping("/authoritylist.do")
    @ResponseBody
    public Map authorityList(Integer page, Integer limit){
       /* System.out.println("11111111111111111111111111111111111111///////////////////+"+id);
        System.out.println(rids[0]);*/
       Map map=authorityService.findAllAuthority(page,limit);

        return map;
    }
    @RequestMapping("/authorityroot.do")
    @ResponseBody
    public List firstAuthorityList(){
       /* System.out.println("11111111111111111111111111111111111111///////////////////+"+id);
        System.out.println(rids[0]);*/
       List list=authorityService.findFirstAuthority();

        return list;
    }
    @RequestMapping("/authorityadd.do")
    @ResponseBody
    public JsonBean addAuthority(Authority authority,Integer[] parentId){
       if(parentId[0] == null && parentId[1]!=null){
           authority.setParentId(parentId[1]);
       }

        authorityService.insertAuthority(authority);
        //System.out.println(authority);
        //return list;

        return new JsonBean(1000,null);
    }
   /* @RequestMapping("/coursedelete.do")
    @ResponseBody
    public JsonBean deleteById(Integer id){
        authorityService.deleteById(id);
        //System.out.println(authority);
        //return list;

        return new JsonBean(1000,null);
    }*/


}