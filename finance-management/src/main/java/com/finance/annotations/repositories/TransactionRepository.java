package com.finance.annotations.repositories;

import com.finance.annotations.models.Transaction;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class TransactionRepository {
    private final List<Transaction> transactions = Collections.synchronizedList(new ArrayList<>());

    public void save(Transaction transaction) {
        transactions.add(transaction);
    }

    public List<Transaction> findAll() {
        return new ArrayList<>(transactions);
    }
}
