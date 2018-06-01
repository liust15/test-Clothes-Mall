package com.liust.utils;

import com.liust.bean.User;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: Clothes
 * @description: 存贮数据
 * @author: liust
 * @create: 2018-05-31 16:28
 **/
public class UserIO {
    private static List<User> userList = new ArrayList<>();
    public static final String USER_FILE = "user.obj";

    //写入用户信息
    public boolean writeUsers() throws BusinessException {

        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(USER_FILE));
            objectOutputStream.writeObject(userList);
            objectOutputStream.close();
        } catch (IOException e) {
            throw new BusinessException("io.write.error");
        }

        return true;

    }

    //读取用户信息
    public boolean readUsers() throws BusinessException {
        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(USER_FILE));
            userList = (List<User>) objectInputStream.readObject();
            objectInputStream.close();
            return true;
        } catch (IOException | ClassNotFoundException e) {
            throw new BusinessException("io.read.error");
        }

    }

    public void add(User user) {
        user.setId(userList.size() + 1);
        userList.add(user);
    }

    public User findByUsernameAndPassword(String username, String password) {
        for (User user : userList) {
            if (username.equals(user.getUsername()) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }
}
