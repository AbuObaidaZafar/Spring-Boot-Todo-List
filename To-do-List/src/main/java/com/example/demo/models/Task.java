package com.example.demo.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data               // Generates Getters, Setters, toString, equals, and hashCode
@NoArgsConstructor  // Generates the required empty constructor for JPA
@AllArgsConstructor // Generates the constructor with (task, completed)
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String task;

    private boolean completed;
}