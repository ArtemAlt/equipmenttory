package com.example.controlservice.controller;

import com.example.controlservice.clients.EquipmentClient;
import com.example.controlservice.clients.LocationClient;
import com.example.controlservice.dto.HealthCheckInfoDto;
import com.example.controlservice.service.HealthCheckBuilder;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.ConnectException;

@RequestMapping(value = "health")
@Tag(name = "ПРОВЕРКА", description = "Check API")
@RestController
@RequiredArgsConstructor
public class HealthCheckServicesController {
    private final EquipmentClient equipmentClient;
    private final LocationClient locationClient;
    private final HealthCheckBuilder builder;

    @GetMapping()
    @Operation(summary = "Информация о доступности сервиса оборудования",
            description = "Информация о доступности сервиса оборудования")
    @ApiResponse(responseCode = "200", description = "Возвращает OK - 200")
    public ResponseEntity<HealthCheckInfoDto> get() {
        ResponseEntity<String> eStr;
        try {
            eStr = equipmentClient.checkAvailableService();
        } catch (Exception e) {
            eStr = new ResponseEntity<>("fail", HttpStatus.SERVICE_UNAVAILABLE);
        }
        ResponseEntity<String> lStr;
        try {
            lStr = locationClient.checkAvailableService();
        } catch (Exception e) {
            lStr = new ResponseEntity<>("fail", HttpStatus.SERVICE_UNAVAILABLE);
        }
        builder.registerStatus("Equipment service ", eStr.getStatusCode().toString());
        builder.registerStatus("Location service ", lStr.getStatusCode().toString());
        return ResponseEntity.ok(builder.buildReport());
    }


}
