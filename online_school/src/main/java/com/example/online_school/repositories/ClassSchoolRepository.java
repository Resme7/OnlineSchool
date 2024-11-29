package com.example.online_school.repositories;

import com.example.online_school.entities.ClassSchool;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassSchoolRepository extends JpaRepository<ClassSchool, Long> {

    ClassSchool save(ClassSchool classSchool);

    ClassSchool findByClassId(Long id);

    ClassSchool findByName(String name);

    ClassSchool findByProfile(String profile);


}
