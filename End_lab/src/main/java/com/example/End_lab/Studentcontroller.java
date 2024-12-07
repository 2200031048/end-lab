package com.example.End_lab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class Studentcontroller {

    @Autowired
    private  Studentservice studentservice;

    @PostMapping("/save")
    public Student save(@RequestBody Student student) {
       return studentservice.add(student);
    }

    @GetMapping("/all")
    public List<Student> all() {
        return studentservice.getAll();
    }
}
