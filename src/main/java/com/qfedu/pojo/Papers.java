package com.qfedu.pojo;

import java.util.Date;

/**
 * Created by Administrator on 2019/6/13.
 * 证件表
 */
public class Papers {

    private  Integer id;
    private String no;//内部员工、学员
    private Integer type;//证书类型1身份证正面 2身份证反面 3手持身份证 4学历证 5学位证 6工作照 7证书 8其他
    private String imageUrl;//图片路径
    private Integer flag;
    private Date startDate;
    private Date endDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }



    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Papers{" +
                "id=" + id +
                ", no='" + no + '\'' +
                ", type=" + type +
                ", imageUrl='" + imageUrl + '\'' +
                ", flag=" + flag +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }

}