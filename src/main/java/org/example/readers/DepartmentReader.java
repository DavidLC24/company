package org.example.readers;

import lombok.AllArgsConstructor;
import org.example.model.Department;
import org.example.model.Employee;

import java.util.Scanner;
@AllArgsConstructor

public class DepartmentReader {
    private final Scanner sc;
    private final EmployeeReader employeeReader;

    public Department read(){
        System.out.println("//Introduce los datos del departamento://");
        System.out.println("Nombre: ");
        String name= sc.nextLine();

        System.out.println("Presupuesto: ");
        Double budget= sc.nextDouble(); sc.nextLine();

        System.out.println("Empleados del departamento: ");
        int number= sc.nextInt(); sc.nextLine();

        Employee[] employees= new Employee[number];
        for (int i = 0; i < number; i++) {
            employees[i]= employeeReader.read();
        }
        return new Department(
                name, budget, employees
        );
    }
}
