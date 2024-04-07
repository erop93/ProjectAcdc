package com.javarush.kondrashov.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
public class User {
    private Long id;
    private String name;
    private final String ip;
    private int score;

    public User(String name, String ip) {
        this.name = name;
        this.ip = ip;
    }

    public void levelUp() {
        score++;
    }
}
