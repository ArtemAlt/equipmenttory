package com.example.equipment.services.interfaces;


import com.example.equipment.dto.create.EquipmentCreateByNameDto;
import com.example.equipment.dto.info.EquipmentInfoDTO;
import com.example.equipment.entity.Equipment;

import java.util.List;
import java.util.UUID;

/**
 * Сервис для работы с оборудованием
 */
public interface EquipmentService {

    /**
     * Вернуть сущность по идентификатору
     * @return сущность
     */
    Equipment getById(UUID id);
    /**
     * Вернуть информацию по идентификатору
     * @return представление
     */
    EquipmentInfoDTO get(UUID id);

    /**
     * вернуть информацию по всеу списку оборудования в системе
     * @return представление
     */
    List<EquipmentInfoDTO> getAll();

//    UUID createNew(EquipmentCreateDto dto);

    void save(Equipment e);

    UUID createNew(EquipmentCreateByNameDto dto);
}
