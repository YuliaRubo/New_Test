package com.example.test1.dao;

import com.example.test1.dto.Chat;
import com.example.test1.dto.Users;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class UserDaoImpl implements UserDao {


   private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

  private  String ADD_USER= "INSERT INTO USERS(userName, createdAt) VALUES(:userName, :createdAt)";

    @Override
    public Users addNewUser(Users user) {
        namedParameterJdbcTemplate.update(ADD_USER, new BeanPropertySqlParameterSource(user));
        return user;
    }

    @Override
    public Chat createNewChat(Chat chat) {
        return null;
    }
}
