package com.example.equipment.mappers.info;

import com.example.equipment.entity.DimensionFeature;
import org.mapstruct.Mapper;

@Mapper
public interface DimensionFeatureMapper {
    DimensionFeature toDto(DimensionFeature f);
}
