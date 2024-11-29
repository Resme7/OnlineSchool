package com.example.online_school.services;


import com.example.online_school.entities.Student;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public interface StudentService {
    Student save(Student student);



    Student getByStudentId(Long studentId);

    Student getByEmail(String email);
}
