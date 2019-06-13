package com.qfedu.pojo;

import java.util.Date;

/**
 * Created by Administrator on 2019/6/13.
 */
public class Msg {
    private Integer id;
    private  Integer type; //1、系统消息 2邮件 3短信 4留言 5通知
    private  String tittle;
    private  String content;
    private Date createTime;
    private  String no;
    private String tono; //接受邮箱/手机号/员工号/学号
    private  Integer flag; //1未读2已读3发送失败4无效

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    public String getTono() {
        return tono;
    }

    public void setTono(String tono) {
        this.tono = tono;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "Msg{" +
                "id=" + id +
                ", type=" + type +
                ", tittle='" + tittle + '\'' +
                ", content='" + content + '\'' +
                ", createTime=" + createTime +
                ", no='" + no + '\'' +
                ", tono='" + tono + '\'' +
                ", flag=" + flag +
                '}';
    }
}
