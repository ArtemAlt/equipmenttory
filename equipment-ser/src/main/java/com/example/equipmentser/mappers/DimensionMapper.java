package com.example.equipmentser.mappers;


import com.example.equipmentser.dto.info.DimensionsInfoDto;
import com.example.equipmentser.entity.Dimensions;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DimensionMapper {
    DimensionsInfoDto toDto(Dimensions d);
}
