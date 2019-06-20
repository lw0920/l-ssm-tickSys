package com.qfedu.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.dao.DepartDao;
import com.qfedu.pojo.Depart;
import com.qfedu.service.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/6/14.
 */
@Service
public class DepartServiceImpl implements DepartService {
    @Autowired(required = false)
    private DepartDao departDao;


    @Override
    public Map findAlldepart(Integer page, Integer limit) {

        PageHelper.startPage(page,limit);
        List<Depart> list = departDao.findAllDepart();
        System.out.println(list.get(0).getSum());
        long total = ((Page)list).getTotal();
        Map map = new HashMap();
        map.put("code",0);
        map.put("msg","");
        map.put("count",total);
        map.put("data",list);


        return map;
    }

    @Override
    public void updateDepart(Depart depart) {

        departDao.updateDepart(depart);
    }

    @Override
    public void deleteDepart(Integer id) {
        departDao.deleteDepart(id);


    }

    @Override
    public void addDepart(Depart depart) {
        departDao.addDepart(depart);
    }
}
