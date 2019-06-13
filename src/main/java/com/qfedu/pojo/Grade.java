package com.qfedu.pojo;

import java.util.Date;

/**
 * Created by Administrator on 2019/6/13.
 */
public class Grade {
    private String id;
    private String name;//校区简拼-学科名称-班号
    private Date createDate;
    private Integer flag;//1有效 2无效
    private Integer week;
    private String location;
    private Integer cid;

    public String getid() {
        return id;
    }

    public void setid(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getWeek() {
        return week;
    }

    public void setWeek(Integer week) {
        this.week = week;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", createDate=" + createDate +
                ", flag=" + flag +
                ", week=" + week +
                ", location='" + location + '\'' +
                ", cid=" + cid +
                '}';
    }
}
