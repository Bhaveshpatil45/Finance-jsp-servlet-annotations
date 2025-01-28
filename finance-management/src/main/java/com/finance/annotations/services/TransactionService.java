package com.finance.annotations.services;

import com.finance.annotations.models.Transaction;
import com.finance.annotations.repositories.TransactionRepository;

import java.util.List;

public class TransactionService {
    private TransactionRepository transactionRepository = new TransactionRepository();

    public void recordTransaction(Transaction transaction) {
        transactionRepository.save(transaction);
    }

    public List<Transaction> getTransactionsForUser(String username) {
        return transactionRepository.findByUsername(username);
    }
}

