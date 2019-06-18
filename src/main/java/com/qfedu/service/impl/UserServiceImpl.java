package com.qfedu.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.dao.AuthorityDao;
import com.qfedu.dao.LoginLogDao;
import com.qfedu.pojo.Authority;
import com.qfedu.pojo.LoginLog;
import com.qfedu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/6/16.
 */

@Service
public class UserServiceImpl implements UserService{

    @Autowired(required = false)
    private AuthorityDao authorityDao;
    @Autowired(required = false)
    private LoginLogDao loginLogDao;


    @Override
    public List<Authority> findAllMenu(String no) {

        List<Authority> allMenu = authorityDao.findAllMenuByNo(no);
        return allMenu;
    }

    @Override
    public void insertLoginLog(LoginLog loginLog) {
        loginLogDao.insertIntoLoginLog(loginLog);
    }

    @Override
    public Map<String,Object> findAllLoginLogByPage(String no, Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        List<LoginLog> list = loginLogDao.findAllLoginLog(no);
        // 获取总记录数
        long total = ((Page) list).getTotal();
        // 获取总页数
        int pages = ((Page) list).getPages();

        Map<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", total);
        map.put("data", list);
        return map;
    }

}