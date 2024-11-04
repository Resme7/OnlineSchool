package com.example.online_school.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


import java.util.Date;
import java.util.List;


@Setter
@Getter
@AllArgsConstructor
public class TeacherDTO {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String office;
    private Date birthDate;
    private String description;
    private List<SubjectDTO> subjectDTOS;
    private boolean headTeacher;
}
