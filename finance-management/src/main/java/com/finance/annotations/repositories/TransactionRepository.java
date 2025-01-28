package com.finance.annotations.repositories;

import com.finance.annotations.models.Transaction;

import java.util.ArrayList;
import java.util.List;

public class TransactionRepository {
    private List<Transaction> transactions = new ArrayList<>();

    public void save(Transaction transaction) {
        transactions.add(transaction);
    }

    public List<Transaction> findByUsername(String username) {
        List<Transaction> userTransactions = new ArrayList<>();
        for (Transaction t : transactions) {
            if (t.getUsername().equals(username)) {
                userTransactions.add(t);
            }
        }
        return userTransactions;
    }
}
