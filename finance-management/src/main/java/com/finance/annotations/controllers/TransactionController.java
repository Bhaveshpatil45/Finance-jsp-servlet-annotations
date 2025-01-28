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
        String amountStr = request.getParameter("amount");

        if (description == null || description.isEmpty() || amountStr == null || amountStr.isEmpty()) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid input data");
            return;
        }

        try {
            double amount = Double.parseDouble(amountStr);
            transactionService.createTransaction(new Transaction(description, amount));
            response.sendRedirect("dashboard.jsp");
        } catch (NumberFormatException e) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Amount must be a valid number");
        }
    }
}
