package com.university.journal.model;

import java.util.Objects;

public class Mark {

    private static int idCounter;

    private long id;
    private Subject subject;
    private int mark;

    public Mark(Subject subject, int mark) {
        this.id = idCounter++;
        this.subject = subject;
        this.mark = mark;
    }

    public long getId() {
        return id;
    }

    public Subject getSubject() {
        return subject;
    }

    public int getMark() {
        return mark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mark mark1 = (Mark) o;
        return id == mark1.id &&
                mark == mark1.mark &&
                Objects.equals(subject, mark1.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, subject, mark);
    }
}
