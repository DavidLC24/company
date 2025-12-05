package org.example.model;

import lombok.*;

@Data
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Department {
    private String name;
    private double budget;
    private Employee[] employees;
}
