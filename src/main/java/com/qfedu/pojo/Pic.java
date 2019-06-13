package com.qfedu.pojo;

/**
 * Created by Administrator on 2019/6/13.
 */
public class Pic {
    private Integer id;
    private String picUrl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    @Override
    public String toString() {
        return "Pic{" +
                "id=" + id +
                ", picUrl='" + picUrl + '\'' +
                '}';
    }
}