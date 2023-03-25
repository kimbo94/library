package com.example.library.entity;

import jakarta.persistence.*;

import java.sql.Time;
import java.util.Date;
@Entity
public class Borrow {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToOne
    @JoinColumn(name = "student_id", referencedColumnName = "id")
    private Student student;
    @ManyToOne
    @JoinColumn(name = "book_id", referencedColumnName = "id")
    private Book book;

    private Date issue_date;
    private Time issue_time;

    public Borrow() {
    }

    public Borrow(int id, Date issue_date, Time issue_time) {
        this.id = id;
        this.issue_date = issue_date;
        this.issue_time = issue_time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getIssue_date() {
        return issue_date;
    }

    public void setIssue_date(Date issue_date) {
        this.issue_date = issue_date;
    }

    public Time getIssue_time() {
        return issue_time;
    }

    public void setIssue_time(Time issue_time) {
        this.issue_time = issue_time;
    }
}
