package com.luciofdasilva.userapi.controllers;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    public String getMenssage(){
        return "Spring boot is working!"
    }
}
