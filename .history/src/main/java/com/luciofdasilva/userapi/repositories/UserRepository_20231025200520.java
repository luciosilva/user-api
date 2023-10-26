package com.luciofdasilva.userapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luciofdasilva.userapi.models.User;
import java.util.List;


public interface UserRepository extends JpaRepository<User, Long> {
    User findByCpf(String cpf);
    List<User findByCpf(String cpf);
}
