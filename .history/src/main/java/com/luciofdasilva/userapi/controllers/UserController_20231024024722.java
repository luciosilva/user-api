package com.luciofdasilva.userapi.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luciofdasilva.userapi.models.UserDTO;

@RestController
public class UserController {

    public static List<UserDTO> usuarios = new ArrayList()<UserDTO>();

    


    @GetMapping("/")
    public String getMenssage(){
        return "Spring boot is workings!";
    }
}
