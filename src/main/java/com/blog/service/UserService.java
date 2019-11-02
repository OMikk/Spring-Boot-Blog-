package com.blog.service;

import java.util.Optional;

import com.blog.model.User;

// Käyttäjän tallennus ja etsintä

public interface UserService {

    Optional<User> findByUsername(String username);

    Optional<User> findByEmail(String email);

    User save(User user);
}
