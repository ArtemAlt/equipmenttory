package com.example.equipmentser.entity;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import jakarta.persistence.*;

import java.util.UUID;

/**
 * Базовая единица определяющая тип оборудования
 */

@Setter
@Getter
@Entity
@Table(name = "models")
public class Model {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private UUID id;
    /**
     * Наименование типа
     */
    @Column(name = "name")
    @NonNull
    private String name;
}
