package com.luciofdasilva.userapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luciofdasilva.userapi.repositories.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository
}
