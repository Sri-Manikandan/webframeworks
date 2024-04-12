package com.example.practice_at_home_1.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.practice_at_home_1.Models.Student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class ApiController {

     List<Student> students = new ArrayList<>();

     @PostMapping("/")
     public boolean postMethodName(@RequestBody Student s) {

          students.add(s);
          return true;

     }

     @GetMapping("{id}")
     public Student getMethodName(@PathVariable int id) {

          for (int i = 0; i < students.size(); i++) {
               if (students.get(i).getId() == id) {
                    return students.get(i);
               }
          }
          return null;

     }

     @GetMapping("/")
     public List<Student> getMethodName() {
          return students;
     }

}
