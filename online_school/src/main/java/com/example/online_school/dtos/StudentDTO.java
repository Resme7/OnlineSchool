package com.example.online_school.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
public class StudentDTO {
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String phoneNumber;
    private Date birthDate;
    private SubjectDTO subjectDTO;
    private TeacherDTO teacherDTO;

}
