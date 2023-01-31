package com.example.equipmentser.services.interfaces;

import com.example.equipmentser.entity.Dimensions;


/**
 * Сервис для работы с характеристикой "Габариты" класса
 * @see com.example.equipmentser.entity.Equipment
 */
public interface DimensionService {
    Dimensions getDefault();
}
