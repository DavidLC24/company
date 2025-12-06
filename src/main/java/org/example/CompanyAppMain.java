package org.example;

import org.example.app.CompanyApp;
import org.example.readers.CompanyReader;
import org.example.readers.DepartmentReader;
import org.example.readers.EmployeeReader;

import java.util.Scanner;

public class CompanyAppMain {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        EmployeeReader employeeReader = new EmployeeReader(sc);
        DepartmentReader departmentReader= new DepartmentReader(sc, employeeReader);
        CompanyReader companyReader= new CompanyReader(sc, departmentReader);

        CompanyApp app= new CompanyApp(sc, companyReader);
        app.run();
    }
}
