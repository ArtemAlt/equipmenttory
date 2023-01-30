package com.example.equipment.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.UUID;

/**
 * Базовая единица определяющая характеристику оборудования
 */

@Setter
@Getter
@Entity
@Table(name = "features")
public class  Feature {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private UUID id;
    /**
     * Наименование характеристики
     */
    @Column(name = "name")
    @NonNull
    private String name;
    /**
     * Значение характеристики
     */
    @Column(name = "value")
    @NonNull
    private String value;
}
