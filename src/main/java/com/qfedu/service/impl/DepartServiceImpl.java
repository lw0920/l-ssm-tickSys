package com.qfedu.service.impl;

import com.qfedu.dao.DepartDao;
import com.qfedu.pojo.Depart;
import com.qfedu.service.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/6/14.
 */
@Service
public class DepartServiceImpl implements DepartService {
    @Autowired(required = false)
    private DepartDao departDao;

    @Override
    public List<Depart> find() {
        List<Depart> departs = departDao.find();
        return  departs;
    }
}
