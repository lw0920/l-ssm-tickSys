package com.qfedu.pojo;

import javax.print.attribute.standard.PrinterURI;
import java.util.Date;

/**
 * Created by Administrator on 2019/6/13.
 */
public class Report {
    private Integer id;
    private Integer type;//1、日报 2周报
    private String tittle;
    private String context;
    private Date createTime;
    private  String no;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Date getcreateTime() {
        return createTime;
    }

    public void setcreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    @Override
    public String toString() {
        return "Report{" +
                "id=" + id +
                ", type=" + type +
                ", tittle='" + tittle + '\'' +
                ", context='" + context + '\'' +
                ", createTime=" + createTime +
                ", no='" + no + '\'' +
                '}';
    }
}
