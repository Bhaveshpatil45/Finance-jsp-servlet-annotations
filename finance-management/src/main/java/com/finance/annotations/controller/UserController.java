package com.finance.annotations.controller;

import com.finance.annotations.models.User;
import com.finance.annotations.services.UserService;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

@WebServlet("/user")
public class UserController extends HttpServlet {
    private UserService userService = new UserService();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String action = request.getParameter("action");

        if ("register".equals(action)) {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            double balance = Double.parseDouble(request.getParameter("balance"));

            User user = new User();
            user.setUsername(username);
            user.setPassword(password);
            user.setBalance(balance);

            userService.createUser(user);
            response.sendRedirect("index.jsp?message=User registered successfully");
        } else if ("updateBalance".equals(action)) {
            String username = request.getParameter("username");
            double amount = Double.parseDouble(request.getParameter("amount"));

            if (userService.updateUserBalance(username, amount)) {
                response.sendRedirect("dashboard.jsp?message=Balance updated");
            } else {
                response.sendRedirect("dashboard.jsp?message=User not found");
            }
        }
    }
}

