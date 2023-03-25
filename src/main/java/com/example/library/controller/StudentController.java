package com.example.library.controller;

import com.example.library.entity.Student;
import com.example.library.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    StudentRepo studentRepo;
    @DeleteMapping("/student/{id}")
    public String deleteStudent(@PathVariable String id) {
        Student student = studentRepo.getOne(id);
        studentRepo.delete(student);
        return "deleted";
    }
    @PostMapping("/student")
    public Student addStudent(@RequestBody Student student) {
        studentRepo.save(student);
        return student;
    }
    @PutMapping("/student")
    public Student saveOrupdateStudent(@RequestBody Student student) {
        studentRepo.save(student);
        return student;
    }
    @GetMapping("/students")
    public List<Student> getStudents() {
        return studentRepo.findAll();
    }
    @GetMapping("/student/{id}")
    public Optional<Student> getStudent(@PathVariable("id") String id) {
        return studentRepo.findById(id);
    }
}
