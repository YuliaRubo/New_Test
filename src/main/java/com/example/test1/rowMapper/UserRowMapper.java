package com.example.test1.rowMapper;

import com.example.test1.dto.Users;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper<Users> {
    @Override
    public Users mapRow(ResultSet rs, int rowNum) throws SQLException {
        Users users = new Users();
        users.setUserId(rs.getInt("userId"));
        users.setUserName(rs.getString("user_name"));
        users.setCreatedAt(rs.getTimestamp("created_at"));
        return users;
    }
}
