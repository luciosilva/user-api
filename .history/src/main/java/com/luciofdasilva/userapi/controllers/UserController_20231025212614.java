package com.luciofdasilva.userapi.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.luciofdasilva.userapi.models.UserDTO;
import com.luciofdasilva.userapi.services.UserService;

import jakarta.annotation.PostConstruct;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public List<UserDTO> getUsers(){
        List<UserDTO> usuarios = userService.getAll();
        return usuarios;
    }

    @GetMapping("/user/{id}")
    public UserDTO getUserFilter(@PathVariable Long id){
        return userService.findById(id);
    }

    @PostMapping("/user")
    UserDTO newUser(@RequestBody UserDTO userDTO){
        return userService.save(userDTO);
    }

    @GetMapping("/user/cpf/{cpf}")
    public UserDTO getUserFilter(@PathVariable String cpf){
        return userService.findByCpf(cpf);
    }

    @DeleteMapping("/user/{id}")
    public UserDTO delete(@PathVariable Long id){
        return userService.delete(id);
    }

    @GetMapping("")

}
