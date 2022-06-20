package com.example.test1.controller;

import com.example.test1.dto.Users;
import com.example.test1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import sun.rmi.runtime.Log;

import java.util.logging.Logger;

@Controller
public class UserController {

   // private  final  static Logger LOGGER= Logger.getLogger(String.valueOf(Controller.class));

    private UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/add")
    public int  addNewUser(@RequestBody Users user){
        //LOGGER.info("save good");
        return userService.addNewUser(user);
    }

    @GetMapping("/users")
    public void getUllUsers(){
        userService.getAllUsersFromUsers();
    }

}
