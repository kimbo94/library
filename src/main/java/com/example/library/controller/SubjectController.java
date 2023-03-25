package com.example.library.controller;

import com.example.library.entity.Student;
import com.example.library.entity.Subject;
import com.example.library.repo.SubjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class SubjectController {
    @Autowired
    SubjectRepo subjectRepo;
    @DeleteMapping("/subject/{id}")
    public String deleteSubject(@PathVariable int id) {
        Subject s = subjectRepo.getOne(id);
        subjectRepo.delete(s);
        return "deleted";
    }
    @PostMapping("/subject")
    public Subject addSubject(@RequestBody Subject subject) {
        subjectRepo.save(subject);
        return subject;
    }
    @PutMapping("/subject")
    public Subject saveOrupdateSubject(@RequestBody Subject subject) {
        subjectRepo.save(subject);
        return subject;
    }
    @GetMapping("/subjects")
    public List<Subject> getSubjects() {
        return subjectRepo.findAll();
    }
    @GetMapping("/subject/{id}")
    public Optional<Subject> getSubject(@PathVariable("id") int id) {
        return subjectRepo.findById(id);
    }
}
