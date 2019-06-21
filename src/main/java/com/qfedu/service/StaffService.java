package com.qfedu.service;

import com.qfedu.pojo.Staff;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/6/14.
 */
public interface StaffService {

    public List<Staff> findStaff();

    public Map<String,Object> findAllByPage(Integer page, Integer limit);

    public void add(Staff staff);

    public void delete(String no);

    public void update(Staff staff);
}
