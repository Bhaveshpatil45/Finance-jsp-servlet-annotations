package com.finance.annotations.models;

import lombok.Data;

@Data
public class Transaction {
    private String description;
    private double amount;

    public Transaction(String description, double amount) {
        this.description = description;
        this.amount = amount;
    }

    // Getters and Setters
}
