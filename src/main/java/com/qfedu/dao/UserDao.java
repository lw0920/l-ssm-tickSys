package com.qfedu.dao;

import com.qfedu.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2019/6/13.
 */
public interface UserDao {


    List<String> findRolesByName(String name);

    List<String> findPermsByName(String name);

    User findByName(String name);

    List<User> findAllUser(@Param("page")Integer page,@Param("limit") Integer limit, @Param("no") String no, @Param("flag") Integer flag);

    Integer findAllUserCount();

    void deleteById(Integer id);




}
