package com.example.equipmentser.mappers;


import com.example.equipmentser.dto.info.DimensionFeatureInfoDto;
import com.example.equipmentser.entity.DimensionFeature;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DimensionFeatureMapper {
    DimensionFeatureInfoDto toDto(DimensionFeature f);
}
