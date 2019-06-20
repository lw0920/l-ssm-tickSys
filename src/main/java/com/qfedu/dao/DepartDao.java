package com.qfedu.dao;

import com.qfedu.pojo.Depart;

import java.util.List;

/**
 * Created by Administrator on 2019/6/13.
 */
public interface DepartDao {

    List<Depart> findAllDepart();

    void updateDepart(Depart depart);

    void deleteDepart(Integer id);

    void addDepart(Depart depart);
}
