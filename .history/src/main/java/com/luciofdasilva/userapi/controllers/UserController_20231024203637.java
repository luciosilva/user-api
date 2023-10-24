package com.luciofdasilva.userapi.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

        UserDTO userDTO2 = new UserDTO();
        userDTO2.setNome("Nome teste2");
        userDTO2.setCpf("12345678902");
        userDTO2.setEndereco("Rua b");
        userDTO2.setEmail("email2@testes.com");
        userDTO2.setTelefone("97865-4562");
        userDTO2.setDataCadastro(new Date());

        usuarios.add(userDTO);
        usuarios.add(userDTO2);
    }


    @GetMapping("/")
    public String getMessage(){
        return "Spring boot is workings!";
    }

    @GetMapping("/users")
    public List<UserDTO> getUsers(){
        return usuarios;
    }

    @GetMapping("/users/{cpf}")
    public UserDTO getUserFilter(@PathVariable String cpf){
        for (UserDTO userFilter : usuarios){
            if(userFilter.getCpf().equals(cpf)){
                return userFilter;
            }
        }
        return null;
    }

    @PostMapping("/newUser")
    UserDTO insert(@RequestBody UserDTO userDTO){
        userDTO.setDataCadastro(new Date());
        usuarios.add(userDTO);
        return userDTO;
    }

    @DeleteMapping("/user/{cpf}")
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
