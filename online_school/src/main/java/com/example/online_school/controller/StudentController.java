package com.example.online_school.controller;

import com.example.online_school.entities.Student;
import com.example.online_school.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin
@RequestMapping(value = "/api/students")
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student students) {
        Student saveStudent = studentService.save(students);
        return ResponseEntity.status(HttpStatus.CREATED).body(saveStudent);
    }


    @GetMapping("/{id}")
    ResponseEntity<Student> getStudentById(@PathVariable Long id){
        return ResponseEntity.ok(studentService.getByStudentId(id));
    }

    @GetMapping("/email/{email}")
    ResponseEntity<Student> getStudentByEmail(@PathVariable String email){
        return ResponseEntity.ok(studentService.getByEmail(email));
    }
}
