package com.example.online_school.services;

import com.example.online_school.entities.ClassSchool;
import org.springframework.stereotype.Service;

@Service
public interface ClassSchoolService {

    ClassSchool getClassSchoolById(Long id);

    ClassSchool getClassSchoolByName(String name);

    ClassSchool getClassSchoolByProfile(String profile);


    ClassSchool save(ClassSchool classSchool);
}
