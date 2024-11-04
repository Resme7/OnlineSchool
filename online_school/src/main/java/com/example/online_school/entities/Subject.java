package com.example.online_school.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "subject")
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subject_id")
    private Long subjectId;

    @Column(name = "name_subject")
    private String nameSubject;

    @Column(name = "description")
    private String description;

    @Column(name = "departament")
    private String department;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "subjectList")
    private List<Teacher> teacherList = new ArrayList<>();
}
