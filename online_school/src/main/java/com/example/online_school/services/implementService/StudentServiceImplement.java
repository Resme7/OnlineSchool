package com.example.online_school.services.implementService;

import com.example.online_school.entities.Student;
import com.example.online_school.repositories.StudentRepository;
import com.example.online_school.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class StudentServiceImplement implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student save(Student student){
        return studentRepository.save(student);
    }

    @Override
    public Student getByStudentId(Long studentId){
        return studentRepository.findByStudentId(studentId);
    }

    @Override
    public Student getByEmail(String email){
        return studentRepository.findByEmail(email);
    }
}
