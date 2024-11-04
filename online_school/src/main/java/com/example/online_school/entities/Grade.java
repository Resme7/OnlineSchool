package com.example.online_school.entities;

import com.example.online_school.dtos.StudentDTO;
import com.example.online_school.dtos.SubjectDTO;
import com.example.online_school.dtos.TeacherDTO;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Setter
@Getter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="grade")
public class Grade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "grade_id")
    private Long gradeId;

    @Column(name = "grade_value")
    private Integer gradeValue;

    @Column(name = "grade_date")
    private Date gradeDate;

    @Column(name = "type")
    private String type;

    @Column(name = "semester")
    private Integer semester;

    @Column(name = "comments")
    private String comments;


    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;
}
