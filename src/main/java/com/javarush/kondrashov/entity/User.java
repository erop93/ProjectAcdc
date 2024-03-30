package com.javarush.kondrashov.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
public class User {
    @Getter
    @Setter
    private Long id;
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private final String ip;
    @Getter
    @Setter
    private int score;

    public User(String name, String ip) {
        this.name = name;
        this.ip = ip;
    }

    public void levelUp() {
        setScore(score + 1);
    }
}
