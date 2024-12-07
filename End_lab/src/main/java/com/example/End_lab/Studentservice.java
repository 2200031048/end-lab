package com.example.End_lab;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Studentservice {

    @Autowired
    StudentRepository studentRepository;

    public Student add(Student student) {
        return studentRepository.save(student);

    }

    public List<Student> getAll() {
        return studentRepository.findAll();
    }
}
