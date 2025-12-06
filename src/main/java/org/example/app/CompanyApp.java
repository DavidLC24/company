package org.example.app;

import lombok.AllArgsConstructor;
import org.example.model.Company;
import org.example.model.Department;
import org.example.model.Employee;
import org.example.readers.CompanyReader;
import java.util.Scanner;

@AllArgsConstructor
public class CompanyApp {
    private final Scanner sc;
    private final CompanyReader companyReader;

    public void run(){
        Company company=companyReader.read();
        int option;
        do {
            option = getOption();

            if(option==1){
                showDepartmentOpt(company);
            } else if (option==2) {
                showEmployeesOpt(company);
            } else if (option==3) {
                findEmployeeOpt(company);
            } else if (option==4) {
                System.out.println("Saliendo...");
            } else {
                System.out.println("Opción inválida");
            }
        }while(option!=4);
    }

    private int getOption() {
        int option;
        System.out.println("//Menú//");
        System.out.println("1. Mostrar datos de un departamento");
        System.out.println("2. Mostrar empleados de un departamento");
        System.out.println("3. Buscar a empleado de un departamento por su NIF");
        System.out.println("4. Salir");
        System.out.println("Elección: ");
        option=sc.nextInt();
        sc.nextLine();
        return option;
    }

    private void showDepartmentOpt(Company company){
        System.out.println("Nombre del departamento: ");
        String name= sc.nextLine();

        Department department= company.showDepartment(name);
        if (department==null){
            System.out.println("No se encuentra el departamento");
        } else {
            System.out.println("//Datos del departamento//");
            System.out.println(department);
        }
    }

    private void showEmployeesOpt(Company company){
        System.out.println("Nombre del departamento: ");
        String name= sc.nextLine();

        Department department=company.showDepartment(name);

        if (department==null) {
            System.out.println("No se encuentra el departamento");
            return;
        }
        System.out.println("//Empleados//");
            for (Employee employee:department.getEmployees()){
                System.out.println(employee);
            }
    }

    public void findEmployeeOpt(Company company){
        System.out.println("Nombre del departamento: ");
        String name= sc.nextLine();

        Department department= company.showDepartment(name);

        if (department==null){
            System.out.println("No existe el departamento");
            return;
        }

        System.out.println("Introduce el NIF del empleado: ");
        String nif= sc.nextLine();
        Employee employee= department.findEmployee(nif);

        if (employee==null){
            System.out.println("No se encuentra el empleado en el departamento");
        } else {
            System.out.println("//Datos del empleado//");
            System.out.println(employee);
        }
    }
}
