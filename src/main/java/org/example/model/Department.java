package org.example.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
    private String name;
    private double budget;
    private Employee[] employees;

    public Employee[] getEmplotees(){
        return employees;
    }

    public Employee findEmployee(String nif){
        for (Employee employee: employees){
            if (employee.getNif().equalsIgnoreCase(nif)){
                return employee;
            }
        }
        return null;
    }
}
