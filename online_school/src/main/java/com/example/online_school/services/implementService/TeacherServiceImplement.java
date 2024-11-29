package com.example.online_school.services.implementService;

import com.example.online_school.entities.Teacher;
import com.example.online_school.repositories.TeacherRepository;
import com.example.online_school.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImplement implements TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;


    @Override
    public Teacher save(Teacher teacher){return teacherRepository.save(teacher);}

    @Override
    public Teacher getByTeacherId(Long teacherId){
        return teacherRepository.findByTeacherId(teacherId);
    }

    @Override
    public Teacher getByEmail(String email){
        return teacherRepository.findByEmail(email);
    }
}
