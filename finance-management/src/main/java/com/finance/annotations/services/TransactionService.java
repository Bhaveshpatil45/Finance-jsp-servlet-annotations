package com.finance.annotations.services;

import com.finance.annotations.models.Transaction;
import com.finance.annotations.repositories.TransactionRepository;

public class TransactionService {
    private final TransactionRepository transactionRepository = new TransactionRepository();

    public void createTransaction(Transaction transaction) {
        transactionRepository.save(transaction);
    }
}
