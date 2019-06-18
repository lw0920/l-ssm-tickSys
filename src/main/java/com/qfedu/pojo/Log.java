package com.qfedu.pojo;

import java.util.Date;

/**
 * Created by Administrator on 2019/6/13.
 */
public class Log {
    private Integer id;
    private Integer type;
    private String content;
    private Date createTime;
    private String no;

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
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
        return "LogController{" +
                "id=" + id +
                ", type=" + type +
                ", content='" + content + '\'' +
                ", createTime=" + createTime +
                ", no='" + no + '\'' +
                '}';
    }
}
