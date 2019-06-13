package com.qfedu.pojo;

import javax.print.attribute.standard.PrinterURI;
import java.util.Date;

/**
 * Created by Administrator on 2019/6/13.
 */
public class Work {
    private Integer id;
    private Integer type;//1、日常考勤 2补签3、加班4、调休5、请假6、外出7、婚假8、产假9、迟到10、旷工
    private Date createTime;
    private  Integer flag;//1有效 2未审核 3审核通过 4审核拒绝
    private  String sno;//Type>1需要
    private  String location;// 位置  只有考勤有
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
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

    @Override
    public String toString() {
        return "Work{" +
                "id=" + id +
                ", type=" + type +
                ", createTime=" + createTime +
                ", flag=" + flag +
                ", sno='" + sno + '\'' +
                ", location='" + location + '\'' +
                ", no='" + no + '\'' +
                '}';
    }
}
