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
    public UserDTO getUserFilter(@PathVariable Long cpf){
        for (UserDTO userFilter : usuarios){
            if(userFilter.getCpf().equals(cpf)){
                return userFilter;
            }
        }
        return null;
    }

    @GetMapping("/user/{cpf}")
    public UserDTO getUserFilter(@PathVariable String cpf){
        for (UserDTO userFilter : usuarios){
            if(userFilter.getCpf().equals(cpf)){
                return userFilter;
            }
        }
        return null;
    }

    @PostMapping("/users")
    UserDTO insert(@RequestBody UserDTO userDTO){
        userDTO.setDataCadastro(new Date());
        usuarios.add(userDTO);
        return userDTO;
    }

    @DeleteMapping("/users/{cpf}")
    public boolean remove(@PathVariable String cpf){
        for(UserDTO userFilter : usuarios) {
            if(userFilter.getCpf().equals(cpf)){
                usuarios.remove(userFilter);
                return true;
            }
        }
        return false;
    }

}
