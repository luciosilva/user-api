package com.luciofdasilva.userapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luciofdasilva.userapi.models.User;

public interface UserRepository extends JpaRepository<User, Long {
    
}
