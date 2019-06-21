package com.qfedu.service;

import com.qfedu.pojo.Authority;
import com.qfedu.pojo.Role;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/6/19.
 */
public interface AuthorityService {


    List<Role> finallrole();

    void insertRoleById(Integer id,Integer[] rids);

    Map findAllAuthority(Integer page,Integer limit);

    List findFirstAuthority();

    void insertAuthority(Authority authority);

    void deleteById(Integer id);
}
