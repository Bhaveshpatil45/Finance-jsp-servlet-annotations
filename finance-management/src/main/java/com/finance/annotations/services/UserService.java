package com.finance.annotations.services;

import com.finance.annotations.models.User;
import com.finance.annotations.repositories.UserRepository;

public class UserService {
    private final UserRepository userRepository = new UserRepository();

    public void createUser(User user) {
        userRepository.save(user);
    }
}
