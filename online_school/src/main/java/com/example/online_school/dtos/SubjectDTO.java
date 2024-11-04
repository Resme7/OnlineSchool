package com.example.online_school.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class SubjectDTO {
    private String nameSubject;
    private String description;
    private String department;
}
