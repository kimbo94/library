package com.example.library.repo;

import com.example.library.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepo extends JpaRepository<Subject,Integer> {
}
