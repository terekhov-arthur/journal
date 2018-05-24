package com.university.journal.controller;

import com.university.journal.service.JournalService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/journal")
public class JournalController {

    private final JournalService journalService;

    public JournalController(JournalService journalService) {
        this.journalService = journalService;
    }

    @GetMapping("/student")
    public String student(Model model) {
        model.addAttribute("students", journalService.findAllStudents());
        return "marks_student";
    }

    @GetMapping("/admin")
    public String admin(Model model) {
        model.addAttribute("journal", journalService.getJournal());
        return "marks_admin";
    }
}
