package com.finance.annotations.repositories;

import com.finance.annotations.models.User;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class UserRepository {
    private final List<User> users = Collections.synchronizedList(new ArrayList<>());

    public void save(User user) {
        users.add(user);
    }

    public List<User> findAll() {
        return new ArrayList<>(users);
    }
}
