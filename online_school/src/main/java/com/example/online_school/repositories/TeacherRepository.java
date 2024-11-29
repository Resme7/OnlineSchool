package com.example.online_school.repositories;


import com.example.online_school.entities.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {
    Teacher save(Teacher teacher );

    Teacher findByTeacherId(Long teacherId);

    Teacher findByEmail(String email);


}
