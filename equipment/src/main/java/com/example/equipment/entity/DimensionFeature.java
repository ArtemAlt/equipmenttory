package com.example.equipment.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.UUID;

/**
 * Базовая единица определяющая физическую характеристику оборудования
 */

@Setter
@Getter
@Entity
@Table(name = "dimension_features")
public class DimensionFeature {
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
