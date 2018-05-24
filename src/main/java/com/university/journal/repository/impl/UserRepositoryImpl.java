package com.university.journal.repository.impl;

import com.university.journal.repository.UserRepository;
import com.university.journal.security.User;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;

@Repository
public class UserRepositoryImpl implements UserRepository {

    private Map<String, User> users;

    public UserRepositoryImpl(Map<String, User> users) {
        this.users = users;
    }

    @Override
    public User find(String username) {
        return users.get(username);
    }
}
