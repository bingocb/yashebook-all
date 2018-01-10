package com.yashebook.utils;

/**
 * Created by binchen on 2018/1/8.
 */
public class UUID {

    public static String get(){
        return java.util.UUID.randomUUID().toString().replace("-", "");
    }
}
