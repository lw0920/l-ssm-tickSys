package com.qfedu.pojo;

/**
 * Created by Administrator on 2019/6/13.
 */
public class City {
    private Integer id;
    private String no;
    private String name;
    private String pno;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPno() {
        return pno;
    }

    public void setPno(String pno) {
        this.pno = pno;
    }

    @Override
    public String toString() {
        return "CityService{" +
                "id=" + id +
                ", no='" + no + '\'' +
                ", name='" + name + '\'' +
                ", pno='" + pno + '\'' +
                '}';
    }
}
