package com.qfedu.service;

import java.util.Map;

/**
 * Created by Administrator on 2019/6/21.
 */
public interface CheckService {
    Map findByPage(Integer page, Integer limit);

}