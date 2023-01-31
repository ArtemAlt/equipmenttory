package com.example.equipmentser.dto.info;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@RequiredArgsConstructor
public class DimensionFeatureInfoDto {

    private UUID id;
    /**
     * Наименование характеристики
     */

    private String name;
    /**
     * Значение характеристики
     */

    private String value;
}
