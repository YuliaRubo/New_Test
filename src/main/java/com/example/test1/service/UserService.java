package com.example.test1.service;

import com.example.test1.dto.Users;
import org.apache.catalina.User;

import java.util.List;

public interface UserService {

    public int addNewUser(Users user);
    List<Users> getAllUsersFromUsers();
    Users getUserById(int userId);

    //public Users getUserById(int id);
}
