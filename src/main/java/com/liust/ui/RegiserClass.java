package com.liust.ui;

import com.liust.bean.User;
import com.liust.service.UserService;
import com.liust.service.impl.UserServiceImpl;
import com.liust.utils.BusinessException;

/**
 * @program: Clothes
 * @description:
 * @author: liust
 * @create: 2018-05-31 15:37
 **/
public class RegiserClass extends BaseClass {
    //用户注册
    public void register() throws BusinessException {
        println(getString("input.username"));
        String username=input.nextLine();
        println(getString("input.password"));
        String password = input.nextLine();
        User user=new User(username,password);
        UserService userService=new UserServiceImpl();
        userService.register(user);
    }
}
