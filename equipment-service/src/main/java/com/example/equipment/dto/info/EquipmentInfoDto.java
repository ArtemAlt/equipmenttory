package com.example.equipment.dto.info;


import lombok.Getter;
import lombok.Setter;

import java.util.Set;
import java.util.UUID;
@Getter
@Setter
public class EquipmentInfoDto {

    private UUID id;
    /**
     * Наименование оборудования
     */

    private String name;

    private ModelInfoDto model;

    private ManufacturerInfoDto manufacturer;

    private DimensionsInfoDto dimensions;
    /**
     * Сетевые характеристики оборудования
     */
    private Set<FeatureInfoDto> featureSet;

}
