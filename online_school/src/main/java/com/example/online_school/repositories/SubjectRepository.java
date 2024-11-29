package com.example.online_school.repositories;

import com.example.online_school.entities.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {
    Subject save(Subject subject);

    Subject findBySubjectId(Long subjectId);

    Subject findByDepartment(String department);
}
