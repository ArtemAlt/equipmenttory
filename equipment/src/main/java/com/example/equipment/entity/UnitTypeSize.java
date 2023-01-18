package com.example.equipment.entity;


import com.example.equipment.enums.EquipmentSize;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.UUID;

/**
 * Базовая единица определяющая размер оборудования в units
 */

@Setter
@Getter
@Entity
@Table(name = "unit_type_size")
public class UnitTypeSize {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private UUID id;
    /**
     * Размер в units
     */
    @Column(name = "size")
    @Enumerated(EnumType.STRING)
    private EquipmentSize size;

}
