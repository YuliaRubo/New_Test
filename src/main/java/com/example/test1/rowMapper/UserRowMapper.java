package com.example.test1.rowMapper;

import com.example.test1.dto.Users;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper<Users> {
    @Override
    public Users mapRow(ResultSet rs, int rowNum) throws SQLException {
        Users users = new Users();
        users.setId(rs.getInt("userId"));
        users.setUserName(rs.getString("username"));
        users.setCreatedAt(rs.getTimestamp("createdAt"));
        return users;
    }
}
