package com.university.journal.config;

import com.university.journal.model.Mark;
import com.university.journal.model.Student;
import com.university.journal.model.Subject;
import com.university.journal.security.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Configuration
public class DataConfig {

    private final PasswordEncoder encoder;
    private final Random random;

    public DataConfig() {
        this.random = new Random();
        this.encoder = new BCryptPasswordEncoder();
    }

    @Bean
    public List<Student> students() {
        return Stream.of("Mike", "John", "Alex", "Sam")
                .map(Student::new)
                .collect(Collectors.toList());
    }

    @Bean
    public List<Subject> subjects() {
        return Stream.of("Math", "Java", "C#", "Data structures")
                .map(Subject::new)
                .collect(Collectors.toList());
    }

    @Bean
    public Map<String, User> users() {
        User alex = new User("alex", encoder.encode("1111"), User.Role.STUDENT);
        User paul = new User("paul", encoder.encode("2222"), User.Role.ADMIN);
        Map<String, User> users = new HashMap<>();

        users.put(alex.getUsername(), alex);
        users.put(paul.getUsername(), paul);

        return users;
    }

    @Bean
    public Map<Student, List<Mark>> journal() {
        Map<Student, List<Mark>> journal = new HashMap<>();

        subjects().forEach(subject -> students()
                  .forEach(student -> journal.compute(student, (key, marks) -> generateMark(subject, marks))));

        return journal;
    }

    private List<Mark> createIfNull(List<Mark> marks) {
        if(marks == null) {
            marks = new ArrayList<>();
        }
        return marks;
    }

    private List<Mark> generateMark(Subject subject, List<Mark> marks) {
        marks = createIfNull(marks);
        marks.add(new Mark(subject, random.nextInt(5) + 1));
        return marks;
    }
}
