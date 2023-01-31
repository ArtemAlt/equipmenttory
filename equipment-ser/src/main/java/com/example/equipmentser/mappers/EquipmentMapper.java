package com.example.equipmentser.mappers;


import com.example.equipmentser.dto.create.EquipmentCreateByNameDto;
import com.example.equipmentser.dto.info.EquipmentInfoDto;
import com.example.equipmentser.entity.Equipment;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EquipmentMapper {
    EquipmentInfoDto toDto(Equipment q);

    List<EquipmentInfoDto> toDto(List<Equipment> all);

    Equipment toEntity(EquipmentCreateByNameDto dto);
}
