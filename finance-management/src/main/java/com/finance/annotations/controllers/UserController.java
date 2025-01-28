package com.finance.annotations.controllers;

import com.finance.annotations.models.User;
import com.finance.annotations.services.UserService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/user")
public class UserController extends HttpServlet {
    private final UserService userService = new UserService();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String balanceStr = request.getParameter("balance");
        String password = request.getParameter("password");

        if (username == null || username.isEmpty() || balanceStr == null || balanceStr.isEmpty() || password == null || password.isEmpty()) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid input data");
            return;
        }

        try {
            double balance = Double.parseDouble(balanceStr);
            userService.createUser(new User(username, password, balance));
            response.sendRedirect("dashboard.jsp");
        } catch (NumberFormatException e) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Balance must be a valid number");
        }
    }
}
