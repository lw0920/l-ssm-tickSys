package com.qfedu.dao;

import com.qfedu.pojo.Authority;

import java.util.List;

/**
 * Created by Administrator on 2019/6/16.
 */
public interface AuthorityDao {

    List<Authority> findAllMenuByNo(String no);
}