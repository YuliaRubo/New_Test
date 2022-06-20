package com.example.test1.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.HashMap;
import java.util.Map;

public class ChatUsersImpl implements ChatUsers{

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    @Autowired
    public ChatUsersImpl(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

private final String ADD_NEW_USERS = "INSERT INTO CHAT_USER (userId, chatId) VALUES (:userId, :chatId)";


    @Override
    public int addUsersIntoChat(int userId, int chatId) {

        return namedParameterJdbcTemplate.query(ADD_NEW_USERS, );


    }
}
