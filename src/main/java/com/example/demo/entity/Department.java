package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
/* We have to add the annotation Entity to the class so that it can interact with the H2 database */

@Data
/* This consist of all the getter, setters etc */
@NoArgsConstructor
/* No Argumemt Constructor */

@AllArgsConstructor
@Builder
/*Adds the builder pattern */
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;

    @NotBlank(message = "Add dept name")
    private String departmentName;
    private String departmentCode;
    private String departmentAddress;


}
