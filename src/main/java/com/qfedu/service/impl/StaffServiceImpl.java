package com.qfedu.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.dao.StaffDao;
import com.qfedu.pojo.Staff;
import com.qfedu.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/6/14.
 */
@Service
public class StaffServiceImpl implements StaffService {
    @Autowired(required = false)
    private StaffDao staffDao;

    @Override
    public List<Staff> findStaff() {
        List<Staff> Allstaff = staffDao.findStaff();
        return Allstaff;
    }

    @Override
    public Map<String, Object> findAllByPage(Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        List<Staff> list = staffDao.findAll();

        long total = ((Page) list).getTotal();// 获取总记录数
        int pages = ((Page) list).getPages();// 获取总页数

        Map<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", total);
        map.put("data", list);
        return map;
    }

    @Override
    public void add(Staff staff) {
        staffDao.add(staff);
    }

    @Override
    public void delete(String no) {
        staffDao.delete(no);
    }

    @Override
    public void update(Staff staff) {
        staffDao.update(staff);
    }

}
