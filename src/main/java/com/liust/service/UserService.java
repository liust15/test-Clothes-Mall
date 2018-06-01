package com.liust.service;

import com.liust.bean.User;
import com.liust.utils.BusinessException;

/**
 * @program: Clothes
 * @description:用户操作
 * @author: liust
 * @create: 2018-05-31 16:20
 **/
public interface UserService {
    User register(User user) throws BusinessException;
    User login(String username, String password)  throws BusinessException ;
}
