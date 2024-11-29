package com.example.online_school.services;

import com.example.online_school.entities.Grade;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public interface GradeService {

    Grade save(Grade grade);
    Grade getGradeByGradeId(Long id);

    Grade getGradeByGradeValue(Integer grade);

}
