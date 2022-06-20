package com.example.test1.dao;

import com.example.test1.dto.Users;
import com.example.test1.rowMapper.UserRowMapper;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UserDaoImpl implements UserDao {


   private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    @Autowired
    public UserDaoImpl(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }


    private   final String ADD_USER = "INSERT INTO USERS(username) VALUES(:username)";
    private final  String GET_USER_BY_ID = "SELECT * FROM users WHERE userId=:useId";
    private final String GET_ALL_USERS = "SELECT * FROM USERS";

   @Override
    public int save(Users user) {
       Map<String, Object> params = new HashMap<>();
       params.put("username", user.getUserName());
       return namedParameterJdbcTemplate.update(ADD_USER, params);
   }

    @Override
    public List<Users> getAllUsersFromUsers() {
        return null;
    }

    @Override
    public User getUserById(int userId) {
        return null;
    }







    //public Users getUserById(int userId) {
       // Map<String,Object> params = new HashMap<>();
      //  params.put("userId", userId);
      //  return  namedParameterJdbcTemplate.queryForObject("GET_USER_BY_ID", params, new UserRowMapper());
      //    }




//        Map<String,Object> params = new HashMap<>();
//        params.put("userName", user.getUserName());
//        //params.put("createdAt", user.getCreatedAt());
//
//        //namedParameterJdbcTemplate.update(ADD_USER, params);
//        return ;



}
