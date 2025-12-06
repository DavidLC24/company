package org.example.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
private String nif;
private String name;
private String surname;
private Position position;
}
