package com.luciofdasilva.userapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luciofdasilva.userapi.models.User;
import java.util.List;


public interface UserRepository extends JpaRepository<User, Long> {
    User findByCpfAndKey(String cpf, String key);
    List<User> queryByNomeLike(String name);
}
