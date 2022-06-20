package com.example.test1.dao;

import com.example.test1.dto.Chat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ChatDaoImpl implements ChatDao{



    NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    @Autowired
    public ChatDaoImpl(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    private final String CHAT_ADD =  "INSERT INTO CHAT(name_chat) VALUES(:name_chat)";
    private  final String GET_ALL_CHATS = "SELECT  NAME_CHAT FROM CHAT";
    private final String GET_ALL_CHATS_FROM_USERS = "";
    private final  String DELETE_CHAT = "DELETE from CHAT where chatId = :chatId";
    private final  String GET_CHATS_BY_ID = "select NAME_CHAT   from CHAT where chatId =:chatId";



    @Override
    public int saveChat(Chat chat) {
       Map<String, Object> params = new HashMap<>();
       params.put("name_chat", chat.getChatName());
       return namedParameterJdbcTemplate.update(CHAT_ADD, params);
    }

    @Override
    public List<Chat> getAllChats() {
        return namedParameterJdbcTemplate.queryForList(GET_ALL_CHATS, );
    }

    @Override
    public List<Chat> getAllChatsFromUser(int userId) {
        return null;
    }

    @Override
    public void deleteChat(int id) {
           return namedParameterJdbcTemplate.update(DELETE_CHAT, id);
    }

    @Override
    public Chat getChatById(int chatId) {
        return null;
    }




}
