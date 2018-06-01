package com.liust.ui;

import com.liust.bean.User;

import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * @program: Clothes
 * @description:
 * @author: liust
 * @create: 2018-05-24 17:19
 **/
public abstract class BaseClass {
    protected static Scanner input = new Scanner(System.in);
    private static ResourceBundle resourceBundle = ResourceBundle.getBundle("com.liust.res.r");
    protected static User currUser;

    public static String getString(String key) {
        return resourceBundle.getString(key);
    }

    public static void println(String s) {
        System.out.println(s);
    }
}
