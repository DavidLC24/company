package org.example.model;

import lombok.*;

import java.util.Scanner;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Company {
    private Scanner sc;
    private String name;
    private String cif;
    private Department[] departments;

    public Department findDepartment(String name){
        for (Department department: departments){
            if (department.getName().equalsIgnoreCase(name)){
                return department;
            }
        }
        return null;
    }

    private void showDepartment(Company company){
        System.out.println("Nombre del apartamento: ");
        String name = sc.nextLine();

        Department department= company.findDepartment(name);

        if (department==null){
            System.out.println("No se encuentra el departamento");
        } else {
            System.out.println("//Datos del departamento//");
            System.out.println(department);
        }
    }
}
