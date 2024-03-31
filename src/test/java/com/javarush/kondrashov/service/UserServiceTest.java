package com.javarush.kondrashov.service;

import com.javarush.kondrashov.entity.User;
import com.javarush.kondrashov.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {
    private UserService userService;
    private UserRepository userRepository;

    @BeforeEach
    public void setUp() {
        userService = new UserService();
        userRepository = Mockito.mock(UserRepository.class);
        UserService.userRepository = userRepository;
    }
        @Test
    void createUserTest() {
            User user = new User("test", "127.0.0.7");
            userService.create(user);
            Mockito.verify(userRepository).create(user);
    }

    @Test
    void getUserIfItExists() {
        long id = 1L;
        User user = new User("test", "127.0.0.7");
        Mockito.when(userRepository.get(id)).thenReturn(Optional.of(user));
        Optional<User> actualUser = userService.get(id);
        assertEquals(Optional.of(user), actualUser);
    }

    @Test
    void getUserIfItDoesntExist() {
        long id = 1L;
        Mockito.when(userRepository.get(id)).thenReturn(Optional.empty());
        Optional<User> actualUser = userService.get(id);
        assertEquals(Optional.empty(), actualUser);
    }
}