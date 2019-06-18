package com.qfedu.pojo;

/**
 * Created by Administrator on 2019/6/13.
 */
public class User {
    private Integer id;
    private String no;
    private String password;
    private Integer flag;//1代表有效2代表无效
    private Integer role;//1学员2员工3管理员
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", no='" + no + '\'' +
                ", password='" + password + '\'' +
                ", flag=" + flag +
                ", role=" + role +
                ", name='" + name + '\'' +
                '}';
    }
}