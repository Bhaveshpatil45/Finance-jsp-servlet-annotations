package com.finance.annotations.services;

import com.finance.annotations.models.User;
import com.finance.annotations.repositories.UserRepository;

public class UserService {
    private UserRepository userRepository = new UserRepository();

    public void createUser(User user) {
        userRepository.save(user);
    }

    public boolean updateUserBalance(String username, double amount) {
        User user = userRepository.findByUsername(username).orElse(null);
        if (user != null) {
            user.setBalance(user.getBalance() + amount);
            userRepository.update(user);
            return true;
        }
        return false;
    }

    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username).orElse(null);
    }
}
