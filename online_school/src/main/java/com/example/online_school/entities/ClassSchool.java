package com.example.online_school.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Setter
@Getter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="class_school")
public class ClassSchool {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "class_id")
    private Long classId;

    @Column(name = "name")
    private String name;

    @Column(name = "profile")
    private String profile;

    @OneToMany(mappedBy = "classSchool", cascade = CascadeType.ALL)
    private List<Student> students;

    @OneToOne
    @JoinColumn(name = "head_teacher_id")
    private Teacher headTeacher;
}
