package com.qfedu.service;

import com.qfedu.pojo.Depart;

import java.util.List;

/**
 * Created by Administrator on 2019/6/14.
 */
public interface DepartService {
    public List<Depart> find();


    Map findAlldepart(Integer page, Integer limit);

    void updateDepart(Depart depart);

    void deleteDepart(Integer id);

    void addDepart(Depart depart);
}
