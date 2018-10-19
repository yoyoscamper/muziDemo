package com.learning.springboot.util;

import java.util.UUID;

/**
 * @Auther: 53097
 * @Date: 2018/10/18 17:02
 * @Description:
 */

public class UUIDUtil {
    public UUIDUtil() {
    }

    public static String getUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    public static void main(String[] args) {
        for(int i = 0; i < 100; ++i) {
            ;
        }

    }
}
