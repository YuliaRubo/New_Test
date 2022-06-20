package com.example.test1.dto;

import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import java.sql.Timestamp;

public class Users {

    private int userId;
    private String userName;
    private Timestamp createdAt;




    public Users() {
    }


    public Users(int userId, String userName, Timestamp createdAt) {
        this.userId = userId;
        this.userName = userName;
        this.createdAt = createdAt;
    }



    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
