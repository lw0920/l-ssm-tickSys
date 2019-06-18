package com.qfedu.service;
import java.util.Map;

/**
 * Created by Administrator on 2019/6/14.
 */
public interface StudentService {

   public Map<String,Object> findAllByPage(Integer page, Integer limit);
}
