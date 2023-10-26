package com.luciofdasilva.userapi.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luciofdasilva.userapi.models.User;
import com.luciofdasilva.userapi.models.UserDTO;
import com.luciofdasilva.userapi.repositories.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<UserDTO> getAll() {
        List<User> usuarios = userRepository.findAll();
        return usuarios
            .stream()
            .map(UserDTO::convert)
            .collect(Collectors.toList());
    }

    public UserDTO findById(long userId) {
        Optional<User> usuario = userRepository.findById(userId);
        if(usuario.isPresent()){
            return UserDTO.convert(usuario.get());
        }
        return null;
    }

    public UserDTO save(UserDTO userDTO) {
        User user = userRepository.save(User.convert(userDTO));
        return UserDTO.convert(user);
    }

    public UserDTO delete(long userId) {
        Optional<User> usuario = userRepository.findById(userId);
        if(usuario.isPresent()){
            userRepository.delete(usuario.get());
        }
        return null;
    }

    public UserDTO findByCpf(String cpf) {
        User user = userRepository.findByCpf(cpf);
        if(user != null){
            return UserDTO.convert(user);
        }
        return null;
    }
}
