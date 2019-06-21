package com.qfedu.service;

import com.qfedu.pojo.Authority;
import com.qfedu.pojo.LoginLog;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/6/16.
 */
public interface UserService {

    List<Authority> findAllMenu(String no);

    void insertLoginLog(LoginLog loginLog);

    Map findAllLoginLogByPage(String no, Integer page, Integer limit);

    Map findAllUser(Integer page, Integer limit, String no, Integer flag);

    void delUser(Integer id);

    Map findAllRoleByPage(Integer page, Integer limit, String no, Integer flag);

}
