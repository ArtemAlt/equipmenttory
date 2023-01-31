package com.example.equipmentser.services.impl;

import com.example.equipmentser.dto.create.EquipmentCreateByNameDto;
import com.example.equipmentser.dto.info.EquipmentInfoDto;
import com.example.equipmentser.entity.Equipment;
import com.example.equipmentser.errors.ResourceNotFoundException;
import com.example.equipmentser.mappers.EquipmentMapper;
import com.example.equipmentser.repository.EquipmentRepository;
import com.example.equipmentser.services.interfaces.DimensionService;
import com.example.equipmentser.services.interfaces.EquipmentService;
import com.example.equipmentser.services.interfaces.ManufacturerService;
import com.example.equipmentser.services.interfaces.ModelService;
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
    private final ModelService modelService;
    private final DimensionService dimensionService;
    private final ManufacturerService manufacturerService;
    private final EquipmentMapper mapper;


    public Equipment getByUUID(UUID id){
       return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Could not find equipment by id - " + id));
    }

    public EquipmentInfoDto getInfoByUUID(UUID id){
        // TODO: 18.01.2023 реализовать
        return null;
    };


    public List<Equipment> getAll(){
        return repository.findAll();
    }


//    UUID createNew(EquipmentCreateDto dto);

    public void save(Equipment e){
        // TODO: 18.01.2023 реализовать
    }

    @Override
    public UUID createNew(EquipmentCreateByNameDto dto) {
        Equipment q = new Equipment();
        q.setName(dto.getName());
        Equipment qq = setDefaultValue(q);
        repository.save(qq);
        return repository.save(q).getId();
    }

    private Equipment setDefaultValue(Equipment q) {
        q.setModel(modelService.getDefault());
        q.setDimensions(dimensionService.getDefault());
        q.setManufacturer(manufacturerService.getDefault());
        return q;
    }

    ;
}
