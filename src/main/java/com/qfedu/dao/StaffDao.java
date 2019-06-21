package com.qfedu.dao;

import com.qfedu.pojo.Staff;

import java.util.List;

/**
 * Created by Administrator on 2019/6/13.
 */
public interface StaffDao {
    public List<Staff> findStaff();

    public List<Staff> findAll();

    public void add(Staff staff);

    public void delete(String no);

    public void update(Staff staff);
}
