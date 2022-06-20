package com.example.test1.dao;

import com.example.test1.dto.Chat;
import com.example.test1.dto.Users;

import java.util.List;

public interface ChatDao {

    int saveChat(Chat chat);

    List<Users> getAllUsersFromJneChat(int chatId);
}
