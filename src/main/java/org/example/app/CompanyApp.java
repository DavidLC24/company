package org.example.app;

import lombok.AllArgsConstructor;
import org.example.model.Company;
import org.example.model.Department;
import org.example.readers.CompanyReader;

import java.util.Scanner;
@AllArgsConstructor
public class CompanyApp {
    private final Scanner sc;
    private CompanyReader companyReader;

    public void run(){
        Company company= companyReader.read();

        int option;

        do {
            option = getOption();

            if(option==1){

            } else if (option==2) {

            } else if (option==3) {

            } else if (option==4) {
                System.out.println("Saliendo...");
            } else {
                System.out.println("Opción inválida");
            }
        }while (option!=4);
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
}
