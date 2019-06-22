package com.qfedu.utils;

import java.util.UUID;

/**
 * Created by Administrator on 2019/6/21.
 */
    public class UUIDUtils {


        public static String getUUID(){
            String uuid = UUID.randomUUID().toString();
            return uuid.replace("-", "");
        }

        public static void main(String[] args) {

            String uuid = UUID.randomUUID().toString();
            System.out.println(uuid);
            System.out.println(uuid.length());

            System.out.println(UUIDUtils.getUUID());
        }

    }