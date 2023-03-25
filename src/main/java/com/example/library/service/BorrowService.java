package com.example.library.service;

import com.example.library.entity.Borrow;
import com.example.library.repo.BorrowRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BorrowService {
    @Autowired
    private BorrowRepo borrowRepo;

    public List<Borrow> getBorrows() {
        return borrowRepo.findAll();
    }
    public Optional<Borrow> getBorrow(int id) {
        return borrowRepo.findById(id);
    }
    public Borrow saveBorrow(Borrow borrow) {
        return borrowRepo.save(borrow);
    }
    public List<Borrow> saveBorrows(List<Borrow> borrow) {
        return borrowRepo.saveAll(borrow);
    }
}
