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
    private final String ip;

    public User(String name, String ip) {
        this.name = name;
        this.ip = ip;
    }
}
