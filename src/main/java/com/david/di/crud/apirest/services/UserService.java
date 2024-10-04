package com.david.di.crud.apirest.services;

import com.david.di.crud.apirest.entities.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User save (User user);

    boolean existsByUsername(String username);
}
