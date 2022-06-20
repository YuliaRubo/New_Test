package com.example.test1.service;

import com.example.test1.dao.UserDao;
import com.example.test1.dto.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public int addNewUser(Users user) {
        return userDao.save(user);
    }

    @Override
    public List<Users> getAllUsersFromUsers() {
        return userDao.getAllUsersFromUsers();
    }

    @Override
    public Users getUserById(int userId) {
        return null;
    }

    //@Override
    //public Users getUserById(int userId) {
        //return userDao.getUserById(userId);    }
}
