package com.example.equipment.mappers.info;

import com.example.equipment.dto.info.FeatureInfoDto;
import com.example.equipment.entity.Feature;
import org.mapstruct.Mapper;

@Mapper
public interface FeatureMapper {
    FeatureInfoDto toDto(Feature f);
}
