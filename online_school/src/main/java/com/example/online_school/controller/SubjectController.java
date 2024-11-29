package com.example.online_school.controller;

import com.example.online_school.entities.Student;
import com.example.online_school.entities.Subject;
import com.example.online_school.services.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin
@RequestMapping("/api/subjects")
public class SubjectController {
    @Autowired
    SubjectService subjectService;

    @PostMapping
    public ResponseEntity<Subject> createSubject(@RequestBody Subject subjects) {
        Subject saveSubject = subjectService.save(subjects);
        return ResponseEntity.status(HttpStatus.CREATED).body(saveSubject);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Subject> getSubjectById(@PathVariable Long id){
        return ResponseEntity.ok(subjectService.getBySubjectId(id));
    }

    @GetMapping("/departament/{departament}")
    public ResponseEntity<Subject> getSubjectByDepartament(@PathVariable String departament){
        return ResponseEntity.ok(subjectService.getByDepartment(departament));
    }
}
