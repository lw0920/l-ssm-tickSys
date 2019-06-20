package com.qfedu.dao;

import com.qfedu.pojo.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2019/6/19.
 */
public interface RoleDao {


    List<Role> findallrole();

    Integer findAllRoleCount();

    List<Role> findAllRoleByPage(@Param("page")Integer page, @Param("limit") Integer limit, @Param("no") String no, @Param("flag") Integer flag);
}
