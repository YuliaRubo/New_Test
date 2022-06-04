package com.example.test1.dto;

import java.sql.Timestamp;
import java.util.List;

public class Chat {

    private int id;
    private String userName;
    private Timestamp createdAt;

    List<Users> usersList;

    public Chat(int id, String userName, Timestamp createdAt, List<Users> usersList) {
        this.id = id;
        this.userName = userName;
        this.createdAt = createdAt;
        this.usersList = usersList;
    }

    public Chat() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public List<Users> getUsersList() {
        return usersList;
    }

    public void setUsersList(List<Users> usersList) {
        this.usersList = usersList;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", createdAt=" + createdAt +
                ", usersList=" + usersList +
                '}';
    }
}
