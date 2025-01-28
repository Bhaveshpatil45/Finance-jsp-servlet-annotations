package com.finance.annotations.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class User {
    private String username;
    private double balance;

    public User(String username, double balance) {
        this.username = username;
        this.balance = balance;
    }
}
