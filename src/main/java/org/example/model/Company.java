package org.example.model;

import lombok.*;

@Data
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Company {
    private String name;
    private String cif;
    private Department[] departments;
}
