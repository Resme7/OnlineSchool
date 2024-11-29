package com.example.online_school.controller;


import com.example.online_school.entities.Grade;
import com.example.online_school.services.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Controller
@CrossOrigin
@RequestMapping(value = "/api/grade")
public class GradeController {
    @Autowired
    GradeService gradeService;

    @PostMapping
    public ResponseEntity<Grade> createGrade(@RequestBody Grade grade) {
        Grade savedGrade = gradeService.save(grade);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedGrade);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Grade> getGradeById(@PathVariable Long id){
        return ResponseEntity.ok(gradeService.getGradeByGradeId(id));
    }

    @GetMapping( "/value/{grade}")
    public ResponseEntity<Grade> getGradeById(@PathVariable Integer grade){
        return ResponseEntity.ok(gradeService.getGradeByGradeValue(grade));
    }


}
