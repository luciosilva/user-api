package com.luciofdasilva.userapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    public static List<UserDTO> usuarios = new 


    @GetMapping("/")
    public String getMenssage(){
        return "Spring boot is workings!";
    }
}
