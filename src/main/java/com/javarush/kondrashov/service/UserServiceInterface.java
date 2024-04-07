package com.javarush.kondrashov.service;

import com.javarush.kondrashov.entity.User;

import java.util.Optional;

public interface UserServiceInterface {
    void create(User user);

    Optional<User> get(long id);

}
