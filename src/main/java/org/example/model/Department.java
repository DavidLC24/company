package org.example.model;

import lombok.*;
import java.util.Arrays;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
    private String name;
    private double budget;
    private Employee[] employees;

    /*public Employee findEmployee (String nif){
        for (Employee employee: employees){
            if (employee.getNif().equalsIgnoreCase(nif)){
                return employee;
            }
        }
        return null;
    }

    public void showEmployees(){
        System.out.println("//Empleados//");
        for (Employee employee : employees){
            System.out.println(employee);
        }
    }

    public void showEmployee(String nif){
        Employee employee = findEmployee(nif);

        if(employee == null){
            System.out.println("No se encuentra el empleado");
        } else {
            System.out.println("//Datos del empleado//");
            System.out.println(employee);
        }
    }*/
}
