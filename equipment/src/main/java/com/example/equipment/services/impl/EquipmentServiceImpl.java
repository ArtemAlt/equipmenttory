package com.example.equipment.services.impl;


import com.example.equipment.dto.info.EquipmentInfoDTO;
import com.example.equipment.entity.Equipment;
import com.example.equipment.repository.EquipmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * Сервис для работы с оборудованием
 */
@Service
@RequiredArgsConstructor
public class EquipmentServiceImpl {
    private final EquipmentRepository repository;


    Equipment getById(UUID id){
        return null;
    };

    EquipmentInfoDTO get(UUID id){
        return null;
    };


    List<EquipmentInfoDTO> getAll(){
        return null;
    };
//    UUID createNew(EquipmentCreateDto dto);

    void save(Equipment e){

    };
}
