package com.javarush.kondrashov.service;

import com.javarush.kondrashov.entity.User;

import java.util.Collection;
import java.util.Optional;

public interface Service {
    void create(User user);
    void update(User user);
    void delete(User user);
    Optional<User> getAll();
    Collection<User> get (long id);
}
