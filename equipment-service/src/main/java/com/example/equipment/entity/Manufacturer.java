package com.example.equipment.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.UUID;

/**
 * Базовая единица определяющая производителя оборудования
 */

@Setter
@Getter
@Entity
@Table(name = "manufacturers")
public class Manufacturer {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private UUID id;
    /**
     * Наименование производителя
     */
    @Column(name = "name")
    @NonNull
    private String name;
}
