package com.qfedu.pojo;

import java.util.List;

/**
 * Created by Administrator on 2019/6/18.
 */
public class Role {
    private Integer id;
    private String info;
    private String name;
    private Integer parentId;
    private List<Authority> list;


    public List<Authority> getList() {
        return list;
    }

    public void setList(List<Authority> list) {
        this.list = list;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }
}