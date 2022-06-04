package com.example.test1.dao;

import com.example.test1.dto.Chat;
import com.example.test1.dto.Users;

public interface UserDao {
    public Users addNewUser(Users user);
    public Chat createNewChat(Chat chat);
}
