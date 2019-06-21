package com.qfedu.dao;

import com.qfedu.pojo.Authority;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2019/6/16.
 */
public interface AuthorityDao {

    List<Authority> findAllMenuByNo(String no);
    void deleteRoleById(Integer id);

    void inserRoleById(@Param("id") Integer id,@Param("rids") Integer[] rids);

    List<Authority> findAllAuthority();

    List findFirstAuthority();

    void insertAuthority(Authority authority);

    void deleteRoleAuthorityByAuthorityId(Integer id);

    void deleteById(Integer id);

}