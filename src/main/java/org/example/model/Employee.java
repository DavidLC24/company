package org.example.model;

import lombok.*;

@Data
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Employee {
private String nif;
private String name;
private String surname;
private Position position;
}
