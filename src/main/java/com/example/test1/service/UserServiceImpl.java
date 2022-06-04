package com.example.test1.service;

import com.example.test1.dao.UserDao;
import com.example.test1.dto.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    private UserDao userDao;
    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public Users addNewUser(Users user) {
      return userDao.addNewUser(user);
    }
}
