package com.example.test1.service;

import com.example.test1.dao.ChatDao;
import com.example.test1.dto.Chat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChatServiceImpl implements ChatService{

    private ChatDao chatDao;

    @Autowired
    public ChatServiceImpl(ChatDao chatDao) {
        this.chatDao = chatDao;
    }

    @Override
    public int saveChat(Chat chat) {
        return chatDao.saveChat(chat);
    }
}
