package com.example.equipmentser.entity;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import jakarta.persistence.*;

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
