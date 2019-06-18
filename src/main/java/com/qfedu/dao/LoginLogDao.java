package com.qfedu.dao;

import com.qfedu.pojo.LoginLog;

import java.util.List;

/**
 * Created by Administrator on 2019/6/13.
 */
public interface LoginLogDao {

    void insertIntoLoginLog(LoginLog loginLog);

    List<LoginLog> findAllLoginLog(String no);
}
