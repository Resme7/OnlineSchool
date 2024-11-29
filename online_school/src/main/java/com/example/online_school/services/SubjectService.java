package com.example.online_school.services;


import com.example.online_school.entities.Subject;
import org.springframework.stereotype.Service;

@Service
public interface SubjectService {
    Subject getBySubjectId(Long subjectId);

    Subject getByDepartment(String department);

    Subject save(Subject subject);
}
