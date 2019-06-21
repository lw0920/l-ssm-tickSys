package com.qfedu.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.dao.AuthorityDao;
import com.qfedu.dao.LoginLogDao;
import com.qfedu.dao.RoleDao;
import com.qfedu.dao.UserDao;
import com.qfedu.pojo.Authority;
import com.qfedu.pojo.LoginLog;
import com.qfedu.pojo.Role;
import com.qfedu.pojo.User;
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
    private UserDao userDao;
    @Autowired(required = false)
    private AuthorityDao authorityDao;
    @Autowired(required = false)
    private LoginLogDao loginLogDao;
    @Autowired(required = false)
    private RoleDao roleDao;



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

        Map<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", total);
        map.put("data", list);
        return map;
    }

    @Override
    public Map findAllUser(Integer page, Integer limit, String no, Integer flag) {
        page=(page-1)*limit;
        List<User> list = userDao.findAllUser(page,limit,no,flag);
//        System.out.println(list+".....................................");
//        System.out.println(list.get(0).getRo().size());
        // 获取总记录数
        Integer total = userDao.findAllUserCount();

        Map<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", total);
        map.put("data", list);
        return map;
}

    @Override
    public void delUser(Integer id) {
        userDao.deleteById(id);
        authorityDao.deleteRoleById(id);
    }

    //角色
    @Override
    public Map findAllRoleByPage(Integer page, Integer limit, String no, Integer flag) {
        page=(page-1)*limit;
        List<Role> list = roleDao.findAllRoleByPage(page,limit,no,flag);
        /*System.out.println(list.size()+"......................................................");
        System.out.println(list);*/
        Integer total = roleDao.findAllRoleCount();


        Map<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", total);
        map.put("data", list);

        return map;
    }

}