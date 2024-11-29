package com.example.online_school.repositories;

import com.example.online_school.entities.Grade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.xml.crypto.Data;
import java.util.Date;

@Repository
public interface GradeRepository extends JpaRepository<Grade, Long> {

    Grade save(Grade grade);
    Grade findByGradeId(Long gradeId);

    Grade findByGradeValue(Integer grade);



}
