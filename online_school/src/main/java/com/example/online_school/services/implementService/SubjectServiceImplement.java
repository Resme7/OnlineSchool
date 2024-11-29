package com.example.online_school.services.implementService;

import com.example.online_school.entities.Subject;
import com.example.online_school.repositories.SubjectRepository;
import com.example.online_school.services.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectServiceImplement implements SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    @Override
    public Subject getBySubjectId(Long subjectId){
        return subjectRepository.findBySubjectId(subjectId);
    }

    @Override
    public Subject getByDepartment(String department){
        return subjectRepository.findByDepartment(department);
    }

    @Override
    public Subject save(Subject subject){
        return subjectRepository.save(subject);
    }
}
