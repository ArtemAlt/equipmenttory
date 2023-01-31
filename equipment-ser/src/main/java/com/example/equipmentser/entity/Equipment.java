package com.example.equipmentser.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.Set;
import java.util.UUID;

/**
 * Базовая единица для описания оборудования
 */
@Setter
@Getter
@Entity
@Table(name = "equipments")
public class Equipment {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private UUID id;
    /**
     * Наименование оборудования
     */
    @Column(name = "name")
    @NonNull
    private String name;
    @OneToOne
    @JoinColumn(name = "model_id")
    private Model model;

    @OneToOne
    @JoinColumn(name = "manufacturer_id")
    private Manufacturer manufacturer;

    @OneToOne
    @JoinColumn(name = "dimension_id")
    private Dimensions dimensions;
    /**
     * Сетевые характеристики оборудования
     */
    @ManyToMany
    @JoinTable(name = "feature_equipment",
            joinColumns = @JoinColumn(name = "equipment_id"),
            inverseJoinColumns = @JoinColumn(name = "feature_id"))
    private Set<Feature> featureSet;
}
