package com.example.equipment.mappers.info;

import com.example.equipment.dto.info.DimensionsInfoDto;
import com.example.equipment.entity.Dimensions;
import org.mapstruct.Mapper;

@Mapper
public interface DimensionMapper {
    DimensionsInfoDto toDto(Dimensions d);
}
