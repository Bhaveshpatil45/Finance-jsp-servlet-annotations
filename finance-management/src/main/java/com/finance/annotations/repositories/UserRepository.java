package com.finance.annotations.repositories;

import com.finance.annotations.models.User;

import java.util.HashMap;
import java.util.Optional;

public class UserRepository {
    private HashMap<String, User> userDatabase = new HashMap<>();

    public void save(User user) {
        userDatabase.put(user.getUsername(), user);
    }

    public Optional<User> findByUsername(String username) {
        return Optional.ofNullable(userDatabase.get(username));
    }

    public void update(User user) {
        userDatabase.put(user.getUsername(), user);
    }
}
