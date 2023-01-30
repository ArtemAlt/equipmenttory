package com.example.equipment.mappers.info;

import com.example.equipment.dto.info.ManufacturerInfoDto;
import com.example.equipment.entity.Manufacturer;
import org.mapstruct.Mapper;

@Mapper
public interface ManufacturedMapper {
    ManufacturerInfoDto toDto(Manufacturer m);
}
