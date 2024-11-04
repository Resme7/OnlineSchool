package com.example.online_school.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
public class ClassDTO {
    private String name;
    private String profile;
    private List<StudentDTO> students;
}
