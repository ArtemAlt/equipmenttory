package com.example.equipmentser.mappers;


import com.example.equipmentser.dto.info.FeatureInfoDto;
import com.example.equipmentser.entity.Feature;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FeatureMapper {
    FeatureInfoDto toDto(Feature f);
}
