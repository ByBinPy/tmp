package org.example.impl.dto;

import lombok.Data;
import org.example.implementations.Colors;
import org.example.implementations.entities.Cat;
import org.example.implementations.entities.Owner;

import java.time.LocalDate;
import java.util.Set;

@Data
public class CatDto {
    private Long id;
    private String name;
    private LocalDate dateOfBirth;
    private String breed;
    private Colors color;
    private Owner owner;
    private Set<Cat> friends;
}
