package com.example.test1.dao;

import com.example.test1.dto.Chat;
import com.example.test1.dto.Users;
import com.example.test1.rowMapper.UserRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.EmptySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserDaoImpl implements UserDao {


   private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

  private  String ADD_USER= "INSERT INTO USERS(userName) VALUES(:userName)";

    @Override
    public Users addNewUser(Users user) {
        Map<String,Object> params = new HashMap<>();
        params.put("userName", user.getUserName());
        //params.put("createdAt", user.getCreatedAt());

        namedParameterJdbcTemplate.update(ADD_USER, params);
        return user;
    }

    @Override
    public Chat createNewChat(Chat chat) {
        return null;
    }
}
