package com.university.journal.service.impl;

import com.university.journal.model.Mark;
import com.university.journal.model.Student;
import com.university.journal.repository.JournalRepository;
import com.university.journal.service.JournalService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class JournalServiceImpl implements JournalService {

    private final JournalRepository journalRepository;

    public JournalServiceImpl(JournalRepository journalRepository) {
        this.journalRepository = journalRepository;
    }

    @Override
    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_STUDENT')")
    public List<Student> findAllStudents() {
        return journalRepository.findAllStudents();
    }

    @Override
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public Map<Student, List<Mark>> getJournal() {
        return journalRepository.getJournal();
    }
}
