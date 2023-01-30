package com.example.equipment.dto.info;

import lombok.*;

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
