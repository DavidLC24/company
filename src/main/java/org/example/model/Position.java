package org.example.model;

import lombok.*;

@Data
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Position {
    private String programmer;
    private String project_manager;
}
