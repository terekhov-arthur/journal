package com.university.journal.security;

import java.util.Objects;

public class User {

    private static int idCounter;

    private int id;
    private String username;
    private String password;
    private Role role;

    public User(String username, String password, Role role) {
        this.role = role;
        this.id = idCounter++;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Role getRole() {
        return role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                Objects.equals(username, user.username) &&
                Objects.equals(password, user.password) &&
                role == user.role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, role);
    }

    public enum Role {
        STUDENT, ADMIN
    }
}
