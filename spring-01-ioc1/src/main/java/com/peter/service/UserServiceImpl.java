package com.peter.service;

import com.peter.dao.UserDao;
import com.peter.dao.UserDaoImpl;
import com.peter.dao.UserDaoMysqlImpl;

public class UserServiceImpl implements UserService {
//    private UserDao user = new UserDaoMysqlImpl();

    private UserDao user;

    public void setUser(UserDao user) {
        this.user = user;
    }

    public void getUser() {
        user.getUser();
    }
}
