package com.example.test1.dao;

import com.example.test1.dto.Chat;
import com.example.test1.dto.Users;

import java.util.List;

public interface ChatDao {

    int saveChat(Chat chat);

    public List<Chat> getAllChats();

    public List<Chat> getAllChatsFromUser(int userId);

    void deleteChat(int id);

    Chat getChatById(int chatId);
}

