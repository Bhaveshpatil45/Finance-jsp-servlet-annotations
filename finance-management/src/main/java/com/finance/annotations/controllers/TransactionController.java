package com.finance.annotations.controllers;

import com.finance.annotations.models.Transaction;
import com.finance.annotations.services.TransactionService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/transaction")
public class TransactionController extends HttpServlet {
    private final TransactionService transactionService = new TransactionService();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String description = request.getParameter("description");
        String amount = request.getParameter("amount");
        transactionService.createTransaction(new Transaction(description, Double.parseDouble(amount)));
        response.sendRedirect("dashboard.jsp");
    }
}
