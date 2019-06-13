package com.qfedu.pojo;

import javax.lang.model.element.NestingKind;
import java.util.Date;

/**
 * Created by Administrator on 2019/6/13.
 */
public class Schedule {
    private Integer id;
    private Integer type;//1、班主任 2讲师3、就业4、项目老师
    private String sno;
    private String gno;
    private Date createDate;
    private Date endDate;
    private Integer flag;//1有效2无效

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

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getGno() {
        return gno;
    }

    public void setGno(String gno) {
        this.gno = gno;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "id=" + id +
                ", type=" + type +
                ", sno='" + sno + '\'' +
                ", gno='" + gno + '\'' +
                ", createDate=" + createDate +
                ", endDate=" + endDate +
                ", flag=" + flag +
                '}';
    }
}
