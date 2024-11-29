package com.example.online_school.services.implementService;

import com.example.online_school.entities.Grade;
import com.example.online_school.repositories.GradeRepository;
import com.example.online_school.services.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class GradeServiceImplement implements GradeService {

    @Autowired
    private GradeRepository gradeRepository;

    @Override
    public Grade save(Grade grade){
        return gradeRepository.save(grade);
    }

    @Override
    public Grade getGradeByGradeId(Long id){
        return gradeRepository.findByGradeId(id);
    }

    @Override
    public Grade getGradeByGradeValue(Integer grade){
        return gradeRepository.findByGradeValue(grade);
    }


}
