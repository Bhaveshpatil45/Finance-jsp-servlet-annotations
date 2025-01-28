package com.finance.annotations.repositories;

import com.finance.annotations.models.Transaction;
import java.util.ArrayList;
import java.util.List;

public class TransactionRepository {
    private final List<Transaction> transactions = new ArrayList<>();

    public void save(Transaction transaction) {
        transactions.add(transaction);
    }
}
