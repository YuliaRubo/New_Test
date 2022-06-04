package com.example.test1.dto;

import com.sun.jmx.snmp.Timestamp;

public class Users {

    private int id;
    private String userName;
    private Timestamp createdAt;

    List<Chat> chatList;


    public Users() {
    }

    public Users(int id, String userName, Timestamp createdAt, List<Chat> chatList) {
        this.id = id;
        this.userName = userName;
        this.createdAt = createdAt;
        this.chatList = chatList;
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

    public List<Chat> getChatList() {
        return chatList;
    }

    public void setChatList(List<Chat> chatList) {
        this.chatList = chatList;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", createdAt=" + createdAt +
                ", chatList=" + chatList +
                '}';
    }
}
