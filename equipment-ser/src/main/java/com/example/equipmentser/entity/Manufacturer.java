package com.example.equipmentser.entity;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import jakarta.persistence.*;

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
