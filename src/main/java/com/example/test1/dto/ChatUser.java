package com.example.test1.dto;

public class ChatUser {



    private Users users;
    private Chat chat;

    public ChatUser(Users users, Chat chat) {
        this.users = users;
        this.chat = chat;
    }

    public ChatUser() {
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Chat getChat() {
        return chat;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }
}
