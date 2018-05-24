package com.university.journal.service;

import com.university.journal.model.Mark;
import com.university.journal.model.Student;

import java.util.List;
import java.util.Map;

public interface JournalService {
    List<Student> findAllStudents();
    Map<Student, List<Mark>> getJournal();
}
