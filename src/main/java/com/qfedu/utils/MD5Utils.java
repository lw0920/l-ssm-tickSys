package com.qfedu.utils;
import org.springframework.util.DigestUtils;

public class MD5Utils {

    public static String getMD5String(String str){
        String oldString = DigestUtils.md5DigestAsHex(str.getBytes());
        String subString = oldString.substring(10,20);
        String salt = "love";
        String newString = oldString+subString+salt;
        return DigestUtils.md5DigestAsHex(newString.getBytes());
    }
    //初始密码为admin
    /**
     * 获取初始字符串
     */
    public static void main(String[] args) {
        String password ="12345";
        password = MD5Utils.getMD5String(password);

        System.out.println(password);


    }



}