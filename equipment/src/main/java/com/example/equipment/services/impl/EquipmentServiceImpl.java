package com.example.equipment.services.impl;


import com.example.equipment.dto.create.EquipmentCreateByNameDto;
import com.example.equipment.dto.info.EquipmentInfoDTO;
import com.example.equipment.entity.Equipment;
import com.example.equipment.repository.EquipmentRepository;
import com.example.equipment.services.interfaces.EquipmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * Сервис для работы с оборудованием
 */
@Service
@RequiredArgsConstructor
public class EquipmentServiceImpl implements EquipmentService {
    private final EquipmentRepository repository;


    public Equipment getById(UUID id){
        // TODO: 18.01.2023 реализовать
        return null;
    };

    public EquipmentInfoDTO get(UUID id){
        // TODO: 18.01.2023 реализовать
        return null;
    };


    public List<EquipmentInfoDTO> getAll(){
        // TODO: 18.01.2023 реализовать
        return null;
    };
//    UUID createNew(EquipmentCreateDto dto);

    public void save(Equipment e){
        // TODO: 18.01.2023 реализовать
    }

    @Override
    public UUID createNew(EquipmentCreateByNameDto dto) {
        return null;
    }

    ;
}