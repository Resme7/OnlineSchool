package com.example.online_school.controller;

import com.example.online_school.entities.Teacher;
import com.example.online_school.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin
@RequestMapping("/api/teachers")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @PostMapping
    ResponseEntity<Teacher> createTeacher(@RequestBody Teacher teacher){
        Teacher saveTeacher = teacherService.save(teacher);
        return ResponseEntity.status(HttpStatus.CREATED).body(saveTeacher);
    }

    @GetMapping("/{id}")
    ResponseEntity<Teacher> getTeacherById(@PathVariable Long id){
        return ResponseEntity.ok(teacherService.getByTeacherId(id));
    }

    @GetMapping("/email/{email}")
    ResponseEntity<Teacher> getTeacherByEmail(@PathVariable String email){
        return ResponseEntity.ok(teacherService.getByEmail(email));
    }
}
