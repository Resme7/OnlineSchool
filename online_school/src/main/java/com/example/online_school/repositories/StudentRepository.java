package com.example.online_school.repositories;

import com.example.online_school.entities.Grade;
import com.example.online_school.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    Student save(Student student);



    Student findByStudentId(Long studentId);

    Student findByEmail(String email);


}
