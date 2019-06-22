package com.qfedu.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.dao.CheckDao;
import com.qfedu.pojo.Check;
import com.qfedu.service.CheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/6/21.
 */
@Service
public class CheckServiceImpl implements CheckService {

    @Autowired(required = false)
    private CheckDao checkDao;
    @Override
    public Map<String,Object> findByPage(Integer page, Integer limit) {

        PageHelper.startPage(page,limit);
        List<Check> list = checkDao.findAllCheck();
        long total = ((Page)list).getTotal();
        Map<String,Object> map =new HashMap();
        map.put("code",0);
        map.put("msg","");
        map.put("count",total);
        map.put("data",list);

        return map;
    }
}