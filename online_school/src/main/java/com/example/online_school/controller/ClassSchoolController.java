package com.example.online_school.controller;

import com.example.online_school.dtos.ClassSchoolDTO;
import com.example.online_school.entities.ClassSchool;
import com.example.online_school.services.ClassSchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin
@RequestMapping(value = "/api/class-school")
public class ClassSchoolController {
    @Autowired
    private ClassSchoolService classSchoolService;

    @PostMapping
    public ResponseEntity<ClassSchool> createClassSchool(@RequestBody ClassSchool classSchool) {
        ClassSchool savedClassSchool = classSchoolService.save(classSchool);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedClassSchool);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClassSchool> getClassSchoolById(@PathVariable Long id) {
        return ResponseEntity.ok(classSchoolService.getClassSchoolById(id));
    }

    @GetMapping("/by-name/{name}")
    public ResponseEntity<ClassSchool> getClassSchoolByName(@PathVariable String name) {
        return ResponseEntity.ok(classSchoolService.getClassSchoolByName(name));
    }

    @GetMapping("/by-profile/{profile}")
    public ResponseEntity<ClassSchool> getClassSchoolByProfile(@PathVariable String profile) {
        return ResponseEntity.ok(classSchoolService.getClassSchoolByProfile(profile));
    }
}
