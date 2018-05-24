package com.university.journal.model;

import java.util.Objects;

public class Student {

    private static int idCounter = 1;

    private long id;
    private String fullName;

    public Student(String fullName) {
        this.id = idCounter++;
        this.fullName = fullName;
    }

    public long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                Objects.equals(fullName, student.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fullName);
    }
}
