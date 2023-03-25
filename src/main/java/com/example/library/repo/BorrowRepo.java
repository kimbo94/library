package com.example.library.repo;

import com.example.library.entity.Borrow;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowRepo extends JpaRepository<Borrow,Integer> {
}
