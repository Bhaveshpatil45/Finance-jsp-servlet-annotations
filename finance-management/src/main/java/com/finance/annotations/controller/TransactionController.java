package com.finance.annotations.controller;

import com.finance.annotations.models.Transaction;
import com.finance.annotations.services.TransactionService;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

@WebServlet("/transaction")
public class TransactionController extends HttpServlet {
    private TransactionService transactionService = new TransactionService();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        double amount = Double.parseDouble(request.getParameter("amount"));
        String description = request.getParameter("description");

        Transaction transaction = new Transaction();
        transaction.setUsername(username);
        transaction.setAmount(amount);
        transaction.setDescription(description);

        transactionService.recordTransaction(transaction);
        response.sendRedirect("dashboard.jsp?message=Transaction recorded");
    }
}
