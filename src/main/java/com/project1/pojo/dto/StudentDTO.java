package com.project1.pojo.dto;

import com.project1.pojo.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class StudentDTO {
    private Integer age;

    private String name;

    public StudentDTO(Student s) {
        this.age = s.getAge();
        this.name = s.getName();
    }
}
