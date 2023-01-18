package com.example.equipment.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;
import java.util.UUID;

/**
 * Базовый класс описывающий физические габариты размерность в units
 */
@Setter
@Getter
@Entity
@Table(name = "dimensions")
public class Dimensions {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private UUID id;
    @OneToOne
    @Column(name="size")
    private UnitTypeSize size;

    /**
     * Физические характеристики оборудования
     */
    @ManyToMany
    @JoinTable(name = "dimensions_feature",
            joinColumns = @JoinColumn(name = "dimension_id"),
            inverseJoinColumns = @JoinColumn(name = "dimension_feature_id"))
    private Set<DimensionFeature> featureSet;


}
