package com.qfedu.controller;

import com.qfedu.pojo.Staff;
import com.qfedu.service.StaffService;
import com.qfedu.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/6/14.
 */
@Controller
public class StaffController {
    @Autowired(required = false)
    private StaffService staffService;


    @RequestMapping("/staffall.do")
    @ResponseBody
    public List<Staff> findStaff(){
        List<Staff> staff = staffService.findStaff();
        System.out.println(staff.size());
        return staff;
    }
    //staffpage.do
    @RequestMapping("/staffpage.do")
    @ResponseBody
    public Map findAll(Integer page, Integer limit){
        Map<String,Object> map=staffService.findAllByPage(page,limit);
        System.out.println(map.size());
        System.out.println(map.get("list"));
        System.out.println(page+"------------"+limit);
        return map;
    }

    @RequestMapping("/staffadd.do")
    @ResponseBody
    public JsonBean add(Staff staff){
        staffService.add(staff);
        return new JsonBean(1000,null);
    }

    @RequestMapping("/staffdelete.do")
    @ResponseBody
    public JsonBean delete(String no){
        staffService.delete(no);
        return new JsonBean(1000,null);
    }

    /*@RequestMapping("/photoupload.do")
    @ResponseBody
    public JsonBean uoload(@RequestParam("file") MultipartFile multipartFile){
        UploadUtils utils = new UploadUtils();
        String path = utils.getPath();
        String upload = utils.upload(multipartFile);
        String msg = path+"/"+upload;
        return new JsonBean(1000,msg);
    }*/
    @RequestMapping("/staffupdate.do")
    @ResponseBody
    public JsonBean updateStaff(Staff staff){
        staffService.update(staff);
        return new JsonBean(1000,null);
    }
}
