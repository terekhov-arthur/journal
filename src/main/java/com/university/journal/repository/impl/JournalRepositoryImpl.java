package com.university.journal.repository.impl;

import com.university.journal.model.Mark;
import com.university.journal.model.Student;
import com.university.journal.model.Subject;
import com.university.journal.repository.JournalRepository;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@Repository
public class JournalRepositoryImpl implements JournalRepository {

    private List<Student> students;
    private Map<Student, List<Mark>> journal;

    public JournalRepositoryImpl(List<Student> students, Map<Student, List<Mark>> journal) {
        this.students = students;
        this.journal = journal;
    }

    @Override
    public List<Student> findAllStudents() {
        return Collections.unmodifiableList(students);
    }

    @Override
    public Map<Student, List<Mark>> getJournal() {
        return Collections.unmodifiableMap(journal);
    }
}
