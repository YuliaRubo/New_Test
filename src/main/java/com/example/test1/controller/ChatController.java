package com.example.test1.controller;

import com.example.test1.dto.Chat;
import com.example.test1.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class ChatController {

    private ChatService chatService;

    @Autowired
    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    @PostMapping("/chat")
    public int saveNewChat(@RequestBody Chat chat){
       return chatService.saveChat(chat);
}}
