package com.example.online_school.services.implementService;

import com.example.online_school.entities.ClassSchool;
import com.example.online_school.repositories.ClassSchoolRepository;
import com.example.online_school.services.ClassSchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class ClassSchoolServiceImplement implements ClassSchoolService {

    @Autowired
    private ClassSchoolRepository classSchoolRepository;

    @Override
    public ClassSchool save(ClassSchool classSchool){
        return classSchoolRepository.save(classSchool);
    }

    @Override
    public ClassSchool getClassSchoolById(Long id){
        return classSchoolRepository.findByClassId(id);
    }

    @Override
    public ClassSchool getClassSchoolByName(String name){
        return classSchoolRepository.findByName(name);
    }

    @Override
    public ClassSchool getClassSchoolByProfile(String profile){
        return classSchoolRepository.findByProfile(profile);
    }

}
