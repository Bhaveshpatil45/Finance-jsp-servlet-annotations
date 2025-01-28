package com.finance.annotations.controllers;

import com.finance.annotations.models.User;
import com.finance.annotations.services.UserService;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/user")
public class UserController extends HttpServlet {
    private final UserService userService = new UserService();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String balance = request.getParameter("balance");
        userService.createUser(new User(username, Double.parseDouble(balance)));
        response.sendRedirect("dashboard.jsp");
    }
}
