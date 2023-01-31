package com.example.equipmentser.mappers;

import com.example.equipmentser.dto.info.ManufacturerInfoDto;
import com.example.equipmentser.entity.Manufacturer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ManufacturedMapper {
    ManufacturerInfoDto toDto(Manufacturer m);
}
