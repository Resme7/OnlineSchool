package com.example.online_school.services;


import com.example.online_school.entities.Teacher;
import org.springframework.stereotype.Service;

@Service
public interface TeacherService{

    Teacher save(Teacher teacher);
    Teacher getByTeacherId(Long teacherId);

    Teacher getByEmail(String email);
}
