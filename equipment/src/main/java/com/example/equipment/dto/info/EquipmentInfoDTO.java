package com.example.equipment.dto.info;


import lombok.Getter;
import lombok.Setter;

import java.util.Set;
import java.util.UUID;
@Getter
@Setter
public class EquipmentInfoDTO {
    private UUID id;

    private String name;
    /**
     * Наименование оборудования
     */
    private ModelInfoDto model;
    /**
     * Производитель оборудования
     */
    private ManufacturerInfoDto manufacturer;

    /**
     * Габариты
     */
    private DimensionsInfoDTO dimensions;

    private Set<FeatureInfoDto> featureSet;


}
