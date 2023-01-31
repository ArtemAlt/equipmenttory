package com.example.equipmentser.dto.info;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.UUID;
@Getter
@Setter
@RequiredArgsConstructor
public class ModelInfoDto {
    private UUID id;
    /**
     * Наименование типа
     */
    private String name;


    @Override
    public String toString() {
        return "ModelInfo{" +
                "id = " + id +
                ", name = '" + name + '\'' +
                '}';
    }
}
