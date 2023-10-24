package com.luciofdasilva.userapi.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luciofdasilva.userapi.models.UserDTO;

import jakarta.annotation.PostConstruct;

@RestController
public class UserController {

    public static List<UserDTO> usuarios = new ArrayList<UserDTO>();

    @PostConstruct
    public void initiateList(){
        UserDTO userDTO = new UserDTO();
        userDTO.setNome("Nome teste");
        userDTO.setCpf("12345678901");
        userDTO.setEndereco("");;
    }


    @GetMapping("/")
    public String getMenssage(){
        return "Spring boot is workings!";
    }
}
