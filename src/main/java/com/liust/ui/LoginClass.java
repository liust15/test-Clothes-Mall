package com.liust.ui;

import com.liust.bean.User;
import com.liust.service.UserService;
import com.liust.service.impl.UserServiceImpl;
import com.liust.utils.BusinessException;

/**
 * @program: Clothes
 * @description:
 * @author: liust
 * @create: 2018-05-31 16:57
 **/
public class LoginClass extends BaseClass {
    public void login() throws BusinessException {
        println(getString("input.username"));
        String username = input.nextLine();
        println(getString("input.password"));
        String password = input.nextLine();
        UserService userService = new UserServiceImpl();
        User user = userService.login(username, password);
        if (user != null) {
            currUser = user;
        } else {
            throw new BusinessException("login.error");
        }
    }
}
