package com.example.library.controller;

import com.example.library.entity.Book;
import com.example.library.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {
    @Autowired
    BookRepo repo;

    @DeleteMapping("/book/{id}")
    public String deleteBook(@PathVariable int id) {
        Book b = repo.getOne(id);
        repo.delete(b);
        return "deleted";
    }
    @PostMapping("/book")
    public Book addBook(@RequestBody Book book) {
        repo.save(book);
        return book;
    }
    @PutMapping("/book")
    public Book saveOrupdateBook(@RequestBody Book book) {
        repo.save(book);
        return book;
    }
    @GetMapping("/books")
    public List<Book> getBooks() {
        return repo.findAll();
    }
    @GetMapping("/book/{id}")
    public Optional<Book> getBook(@PathVariable("id") int id) {
        return  repo.findById(id);
    }
}
