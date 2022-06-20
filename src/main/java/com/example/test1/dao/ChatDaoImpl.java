package com.example.test1.dao;

import com.example.test1.dto.Chat;
import com.example.test1.dto.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ChatDaoImpl implements ChatDao{


    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    @Autowired
    public ChatDaoImpl(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    private final String CHAT_ADD =  "INSERT INTO CHAT(name_chat) VALUES(:name_chat)";
    //private final String CHAT_WITH_USERS = "SELECT * FROM USERS WHERE ";


    @Override
    public int saveChat(Chat chat) {
       Map<String, Object> params = new HashMap<>();
       params.put("name_chat", chat.getChatName());
       return namedParameterJdbcTemplate.update(CHAT_ADD, params);
    }

    @Override
    public List<Users> getAllUsersFromJneChat(int chatId) {
        return null;
    }


}
