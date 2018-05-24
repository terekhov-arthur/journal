package com.university.journal.repository;

import com.university.journal.security.User;

public interface UserRepository {
    User find(String login);
}
