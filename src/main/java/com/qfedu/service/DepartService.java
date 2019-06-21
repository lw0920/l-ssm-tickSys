package com.qfedu.service;

import com.qfedu.pojo.Depart;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/6/14.
 */
public interface DepartService {


    Map findAlldepart(Integer page, Integer limit);

    void updateDepart(Depart depart);

    void deleteDepart(Integer id);

    void addDepart(Depart depart);

    List<Depart> find();

    List findAllDepart();

}
