package com.university.journal.repository;

import com.university.journal.model.Mark;
import com.university.journal.model.Student;

import java.util.List;
import java.util.Map;

public interface JournalRepository {
    List<Student> findAllStudents();
    Map<Student, List<Mark>> getJournal();
}
