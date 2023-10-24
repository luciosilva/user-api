package com.luciofdasilva.userapi.controllers;

import java.util.ArrayList;
import java.util.Date;
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
        userDTO.setEndereco("Rua a");
        userDTO.setEmail("email@testes.com");
        userDTO.setTelefone("97865-4561");
        userDTO.setDataCadastro(new Date());

        usuarios.add(userDTO);
    }


    @GetMapping("/")
    public String getMessage(){
        return "Spring boot is workings!";
    }

    @GetMapping("/users")
    public String getUsers(){
        return "Spring boot is workings!";
    }
}
