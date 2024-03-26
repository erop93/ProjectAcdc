package com.javarush.kondrashov.service;

import com.javarush.kondrashov.entity.User;
import com.javarush.kondrashov.repository.BaseRepository;
import com.javarush.kondrashov.repository.UserRepository;

import java.util.Optional;

public class UserService implements Service {

    private static Service userService;
    private static BaseRepository userRepository;

    public UserService() {
        userRepository = new UserRepository();
    }

    public static Service getInstance() {
        if (userService == null) {
            userService = new UserService();
        }
        return userService;
    }

    @Override
    public void create(User user) {
        userRepository.create(user);
    }

    @Override
    public Optional<User> get(long id) {
        return userRepository.get(id);
    }
}
