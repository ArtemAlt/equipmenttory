package com.example.equipmentser.mappers;


import com.example.equipmentser.dto.info.ModelInfoDto;
import com.example.equipmentser.entity.Model;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ModelMapper {
    ModelInfoDto toDto(Model model);
}
