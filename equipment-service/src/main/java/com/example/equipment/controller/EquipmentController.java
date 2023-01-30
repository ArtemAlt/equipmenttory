package com.example.equipment.controller;


import com.example.equipment.dto.create.EquipmentCreateByNameDto;
import com.example.equipment.dto.info.EquipmentInfoDto;
import com.example.equipment.mappers.info.EquipmentMapper;
import com.example.equipment.services.interfaces.EquipmentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@RequestMapping(value = "equipment")
@Tag(name = "ОБОРУДОВАНИЕ", description = "the equipment API")
@RestController
public class EquipmentController {
    private final EquipmentService service;
    private final EquipmentMapper mapper;

    @PostMapping("/new")
    @Operation(summary = "Создание нового оборудования без привязки к стойке", description = "Создание нового оборудования без привязки к стойке")
    @ApiResponse(responseCode = "200", description = "Возвращает uuid созданной записи")
    public ResponseEntity<UUID> createNew(@Parameter(description = "Форма запроса на создание нового оборудования")
                                          @RequestBody EquipmentCreateByNameDto dto) {
        return new ResponseEntity<>(service.createNew(dto), HttpStatus.OK);
    }

    @GetMapping("/all")
    @Operation(summary = "Список всего оборудования в системе", description = "Список всего оборудования в системе")
    @ApiResponse(responseCode = "200", description = "Возвращает список всего оборудования в системе")
    public ResponseEntity<List<EquipmentInfoDto>> getAll() {
        return new ResponseEntity<>(mapper.toDto(service.getAll()), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Информация по оборудованию", description = "Информация по оборудованию")
    @ApiResponse(responseCode = "200", description = "Возвращает информацию по оборудованию")
    public ResponseEntity<EquipmentInfoDto> get(@Parameter(description = "UUID оборудования")
                                               @PathVariable(value = "id") UUID id) {
        return new ResponseEntity<>(mapper.toDto(service.getById(id)), HttpStatus.OK);
    }

//    @PostMapping("/add-new")
//    @Operation(summary = "Добавление новой комнаты в адрес", description = "Добавление новой комнаты в адрес")
//    @ApiResponse(responseCode = "200", description = "Возвращает информацию об обновленной записи")
//    public ResponseEntity<LocationInfoDTO> add(@Parameter(description = "UUID адреса")
//                                               @RequestParam(value = "loc_id") UUID loc_id,
//                                               @Parameter(description = "Параметры новой комнаты")
//                                               @RequestBody CompartmentCreateDto dto) {
//        return new ResponseEntity<>(service.add(loc_id, dto), HttpStatus.OK);
//    }
}
