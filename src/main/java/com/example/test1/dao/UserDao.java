package com.example.test1.dao;

import com.example.test1.dto.Chat;
import com.example.test1.dto.Users;
import org.apache.catalina.User;

import java.util.List;

public interface UserDao {

    int save(Users user);
    List<Users> getAllUsersFromUsers();
    User getUserById(int userId);
//    int createNewChat(Chat chat);


}
