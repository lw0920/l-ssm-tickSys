package com.qfedu.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.dao.AuthorityDao;
import com.qfedu.dao.RoleDao;
import com.qfedu.pojo.Authority;
import com.qfedu.pojo.Role;
import com.qfedu.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/6/19.
 */
@Service
@Transactional
public class AuthorityServiceImpl implements AuthorityService {

    @Autowired(required = false)
    private AuthorityDao authorityDao;
    @Autowired(required = false)
    private RoleDao roleDao;


    @Override
    public List<Role> finallrole() {
        List<Role> list= roleDao.findallrole();
        return list;
    }

    @Override
    public void insertRoleById(Integer id, Integer[] rids) {
        authorityDao.deleteRoleById(id);
        authorityDao.inserRoleById(id,rids);
    }

    @Override
    public Map<String,Object> findAllAuthority(Integer page , Integer limit) {

        PageHelper.startPage(page,limit);
        List<Authority> list = authorityDao.findAllAuthority();
        System.out.println(list.size()+"......................................................");
        System.out.println(list);
        long total =((Page)list).getTotal();
        Map<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", total);
        map.put("data", list);

        return map;

    }

    @Override
    public List findFirstAuthority() {
        List list = authorityDao.findFirstAuthority();
        return list;
    }

    @Override
    public void insertAuthority(Authority authority) {
        authorityDao.insertAuthority(authority);
    }

    @Override
    public void deleteById(Integer id) {

        authorityDao.deleteRoleAuthorityByAuthorityId(id);
        authorityDao.deleteById(id);


    }
}