package com.liust.utils;

/**
 * @program: Clothes
 * @description:
 * @author: liust
 * @create: 2018-05-31 18:01
 **/
public class EmptyUtils {
    public static boolean isEmpty(String s){
        if (null==s||"".equals(s))
            return true;
        return false;
    }
}
