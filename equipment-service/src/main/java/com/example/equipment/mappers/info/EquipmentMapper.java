package com.example.equipment.mappers.info;

import com.example.equipment.dto.info.EquipmentInfoDto;
import com.example.equipment.entity.Equipment;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface EquipmentMapper {
    EquipmentInfoDto toDto(Equipment q);

    List<EquipmentInfoDto> toDto(List<Equipment> all);
}
