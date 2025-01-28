package com.finance.annotations.models;

import lombok.Data;

@Data
public class User {
    private String username;
    private String password;
    private double balance;
}
