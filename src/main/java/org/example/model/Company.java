package org.example.model;

import lombok.*;

import java.util.Scanner;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Company {
    private String name;
    private String cif;
    private Department[] departments;

    public Department showDepartment(String name){
        for (Department department: departments){
            if (department.getName().equalsIgnoreCase(name)){
                return department;
            }
        }
        return null;
    }
}
