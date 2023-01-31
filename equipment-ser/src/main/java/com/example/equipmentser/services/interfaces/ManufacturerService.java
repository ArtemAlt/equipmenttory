package com.example.equipmentser.services.interfaces;


import com.example.equipmentser.entity.Manufacturer;


/**
 * Сервис для работы с характеристикой "Производитель" класса
 * @see com.example.equipmentser.entity.Equipment
 */
public interface ManufacturerService {
    Manufacturer getDefault();
}
