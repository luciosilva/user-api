package com.luciofdasilva.userapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luciofdasilva.userapi.models.User;
import com.luciofdasilva.userapi.repositories.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAll() {
        List<User> usuarios 
    }
}
