package com.example.online_school.dtos;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
public class GradeDTO {

    private Integer gradeValue;
    private Date gradeDate;
    private String type;
    private Integer semester;
    private String comments;
    private StudentDTO studentDTO;
    private TeacherDTO teacherDTO;
    private SubjectDTO subjectDTO;

}
