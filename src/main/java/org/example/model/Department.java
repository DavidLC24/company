package org.example.model;

import lombok.*;

import java.util.Scanner;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
    private Scanner sc;
    private String name;
    private double budget;
    private Employee[] employees;

    public Employee findEmployee (String nif){
        for (Employee employee: employees){
            if (employee.getNif().equalsIgnoreCase(nif)){
                return employee;
            }
        }
        return null;
    }

    private void showEmployees(Company company){
        System.out.println("Nombre del departamento");
        String name= sc.nextLine();

        Department department= company.findDepartment(name);

        if (department==null){
            System.out.println("No se encuentra el departamento");
        } else {
            System.out.println("//Empleados//");
            for (Employee employee: department.getEmployees()){
            System.out.println(employee);
            }
        }
    }

    private void showEmployee (Company company){
        System.out.println("Introduce el nombre del departamento: ");
        String depName= sc.nextLine();

        Department department= company.findDepartment(depName);

        if (department==null){
            System.out.println("No existe el departamento");
            return;
        }

        System.out.println("Introduce el NIF del empleado: ");
        String nif= sc.nextLine();

        Employee employee= department.findEmployee(nif);

        if (employee==null){
            System.out.println("El empleado no se encuentra en este departamento");
        } else {
            System.out.println("//Datos del empleado//");
            System.out.println(employee);
        }
    }
}
