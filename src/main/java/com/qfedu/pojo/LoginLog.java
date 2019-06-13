package com.qfedu.pojo;

import java.util.Date;

/**
 * Created by Administrator on 2019/6/13.
 */
public class LoginLog {
    private Integer id;
    private String ip;//登陆城市
    private String location;
    private String no;
    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public Date getcreateTime() {
        return createTime;
    }

    public void setcreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "LoginLog{" +
                "id=" + id +
                ", ip='" + ip + '\'' +
                ", location='" + location + '\'' +
                ", no='" + no + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
