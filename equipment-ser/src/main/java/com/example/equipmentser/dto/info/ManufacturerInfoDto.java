package com.example.equipmentser.dto.info;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@RequiredArgsConstructor
public class ManufacturerInfoDto {

    private UUID id;
    /**
     * Наименование производителя
     */
    private String name;
}
