package org.example.readers;

import lombok.*;
import org.example.model.Company;
import org.example.model.Department;

import java.util.Scanner;
@Data
@AllArgsConstructor
public class CompanyReader {
    private final Scanner sc;
    private final DepartmentReader departmentReader;

/*public Company read(){
    System.out.println("//Introduce los datos de la empresa//");
    System.out.println("Nombre: ");
    String name= sc.nextLine();

    System.out.println("CIF: ");
    String cif= sc.nextLine();

    System.out.println("¿Cuántos departamentos tiene?");
    int numDepartments= sc.nextInt(); sc.nextLine();

    Department[] departments= new Department[numDepartments];
    for (int i = 0; i < departments.length; i++) {
    }
}*/

}
