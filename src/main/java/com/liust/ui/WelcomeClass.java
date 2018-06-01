package com.liust.ui;

import com.liust.utils.BusinessException;
import com.liust.utils.UserIO;

/**
 * @program: Clothes
 * @description:
 * @author: liust
 * @create: 2018-05-24 17:24
 **/
public class WelcomeClass extends BaseClass {
    public void start() {
        println(getString("info.welcome"));
        UserIO userIO=new UserIO();
        userIO.readUsers();
        boolean flag = true;
        while (flag) {
            println(getString("info.login.reg"));
            println(getString("info.select"));
            String select = input.nextLine();
            switch (select) {
                case "1":
                    try {
                        new LoginClass().login();
                        println(getString("login.success"));
                        flag=true;
                    } catch (BusinessException e) {
                        println(getString(e.getMessage()));
                    }
                    break;
                case "2":
                    try {
                        new RegiserClass().register();
                        flag=true;
                        println(getString("reg.success"));
                    } catch (BusinessException e) {
                        println(getString("input.error"));
                    }
                    break;
                default:
                    println(getString("input.error"));
                    break;
            }
        }
    }
}
