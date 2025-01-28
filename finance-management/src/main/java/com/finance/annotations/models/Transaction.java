package com.finance.annotations.models;

import lombok.Data;

@Data
public class Transaction {
    private String username;
    private double amount;
    private String description;
}

