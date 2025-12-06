package org.example.readers;

import lombok.AllArgsConstructor;
import org.example.model.Employee;
import org.example.model.Position;

import java.util.Scanner;
@AllArgsConstructor

public class EmployeeReader {
    private final Scanner sc;

    public Employee read(){
        System.out.println("//Introduce los datos del empleado//");
        System.out.println("NIF: ");
        String nif= sc.nextLine();
        System.out.println("Nombre: ");
        String name= sc.nextLine();

        System.out.println("Apellido: ");
        String surname= sc.nextLine();

        Position position= null;
        do {
            System.out.println("Posición: ");
            System.out.println("1. Programador");
            System.out.println("2. Jefe de Proyecto");
            int index= sc.nextInt(); sc.nextLine();
            if (index==1){
                position=position.Programmer;
            } else if (index==2) {
                position= position.Project_manager;
            }
        }while (position==null);

        return new Employee(
          nif, name, surname, position
        );

    }
}
