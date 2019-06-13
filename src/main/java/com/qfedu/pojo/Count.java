package com.qfedu.pojo;

/**
 * Created by Administrator on 2019/6/13.
 */
public class Count {
    private Integer id;
    private String no;//4位市区编号+
    private String name;//县区名称
    private String weatherCode;//天气网编码
    private String cno;//市区的编码

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

    public String getweatherCode() {
        return weatherCode;
    }

    public void setweatherCode(String weatherCode) {
        this.weatherCode = weatherCode;
    }

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    @Override
    public String toString() {
        return "Count{" +
                "id=" + id +
                ", no='" + no + '\'' +
                ", name='" + name + '\'' +
                ", weatherCode='" + weatherCode + '\'' +
                ", cno='" + cno + '\'' +
                '}';
    }
}
