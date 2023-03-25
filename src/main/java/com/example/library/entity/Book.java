package com.example.library.entity;

import jakarta.persistence.*;

import java.sql.Time;
import java.util.Date;
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name = "subject_id", referencedColumnName = "id")
    private  Subject subj;
    private String book_id;
    private String name;
    private Date regdate;
    private String type;
    private String author;
    private String subject;

    public Book() {
    }

    public Book(int id, String book_id, String name, Date regdate, String type, String author, String subject) {
        this.id = id;
        this.book_id = book_id;
        this.name = name;
        this.regdate = regdate;
        this.type = type;
        this.author = author;
        this.subject = subject;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBook_id() {
        return book_id;
    }

    public void setBook_id(String book_id) {
        this.book_id = book_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getRegdate() {
        return regdate;
    }

    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
