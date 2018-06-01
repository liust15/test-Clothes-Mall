package com.liust.service.impl;

import com.liust.bean.User;
import com.liust.service.UserService;
import com.liust.utils.BusinessException;
import com.liust.utils.EmptyUtils;
import com.liust.utils.UserIO;

/**
 * @program: Clothes
 * @description: 实现用户操作
 * @author: liust
 * @create: 2018-05-31 16:21
 **/
public class UserServiceImpl implements UserService {
    @Override
    public User register(User user) throws BusinessException {
        UserIO userIO = new UserIO();
        userIO.add(user);
        userIO.writeUsers();
        return user;
    }

    @Override
    public User login(String username, String password) {
        if (EmptyUtils.isEmpty(username)) {
            throw new BusinessException("username.notnull");
        }
        if (EmptyUtils.isEmpty(password)) {
            throw new BusinessException("password.notnull");
        }
        UserIO userIO = new UserIO();
        return  userIO.findByUsernameAndPassword(username, password);
    }
}
