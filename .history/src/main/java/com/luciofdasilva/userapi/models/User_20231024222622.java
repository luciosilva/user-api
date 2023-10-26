package com.luciofdasilva.userapi.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

//import javax.persistence.Entity;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long i
    
}
