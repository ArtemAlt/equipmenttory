package com.example.equipmentser.services.interfaces;

import com.example.equipmentser.dto.create.EquipmentCreateByNameDto;
import com.example.equipmentser.dto.info.EquipmentInfoDto;
import com.example.equipmentser.entity.Equipment;

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
    Equipment getByUUID(UUID id);
    /**
     * Вернуть информацию по идентификатору
     * @return представление
     */
    EquipmentInfoDto getInfoByUUID(UUID id);

    /**
     * вернуть информацию по всеу списку оборудования в системе
     *
     * @return представление
     */
    List<Equipment> getAll();

//    UUID createNew(EquipmentCreateDto dto);

    void save(Equipment e);

    UUID createNew(EquipmentCreateByNameDto dto);
}
