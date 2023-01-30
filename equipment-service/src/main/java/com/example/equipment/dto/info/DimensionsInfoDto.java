package com.example.equipment.dto.info;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public class DimensionsInfoDto {

    private UUID id;

    private String size;

    /**
     * Физические характеристики оборудования
     */

    private Set<DimensionFeatureInfoDto> featureSet;
}
