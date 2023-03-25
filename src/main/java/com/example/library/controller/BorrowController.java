package com.example.library.controller;

import com.example.library.entity.Borrow;
import com.example.library.service.BorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/borrows")
public class BorrowController {
    @Autowired
    BorrowService service;

    @GetMapping
    public List<Borrow> showAllBorrow() {
        return service.getBorrows();
    }

    @GetMapping("/{id}")
    public Optional<Borrow> showBorrow(@PathVariable int id) {
        return service.getBorrow(id);
    }

    @PostMapping("")
    public Borrow saveBorrow(@RequestBody Borrow borrow) {
        return service.saveBorrow(borrow);
    }
    @PostMapping("/add")
    public List<Borrow> saveBorrows(@RequestBody List<Borrow> borrow) {
        return service.saveBorrows(borrow);
    }
}

