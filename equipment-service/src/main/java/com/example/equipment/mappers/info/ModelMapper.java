package com.example.equipment.mappers.info;

import com.example.equipment.dto.info.ModelInfoDto;
import com.example.equipment.entity.Model;
import org.mapstruct.Mapper;

@Mapper
public interface ModelMapper {
    ModelInfoDto toDto(Model model);
}
