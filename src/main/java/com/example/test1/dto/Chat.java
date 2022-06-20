package com.example.test1.dto;

import sun.plugin2.message.Message;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;


public class Chat {

    private int chatId;
    private String chatName;
    private Timestamp createdAt;
    private List<Users> listUser;
    private List<Message> messages;

    public Chat(int chatId, String chatName, Timestamp createdAt) {
        this.chatId = chatId;
        this.chatName = chatName;
        this.createdAt = createdAt;
    }

    public Chat(int chatId, String chatName, Timestamp createdAt, List<Users> listUser) {
        this.chatId = chatId;
        this.chatName = chatName;
        this.createdAt = createdAt;
        this.listUser = listUser;

    }

    public Chat() {
    }

    public Chat(String chatName) {
        this.chatName = chatName;
    }

    public void addUsersIntoChat(Users user) {
        if(user==null){
       listUser = new ArrayList<>();
        }
        listUser.add(user);
    }

    public void addUserToMessage(Message message){
        if(message==null){
            messages = new ArrayList<>();
        }
            messages.add(message);


        }


    public List<Users> getListUser() {
        return listUser;
    }

    public void setListUser(List<Users> listUser) {
        this.listUser = listUser;
    }


    public int getChatId() {
        return chatId;
    }

    public void setChatId(int chatId) {
        this.chatId = chatId;
    }

    public String getChatName() {
        return chatName;
    }

    public void setChatName(String chatName) {
        this.chatName = chatName;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "chatId=" + chatId +
                ", chatName='" + chatName + '\'' +
                ", createdAt=" + createdAt +
                ", listUser=" + listUser +
                '}';
    }
}
