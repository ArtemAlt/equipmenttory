package com.example.equipmentser.controller;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "health")
@Tag(name = "ПРОВЕРКА", description = "Check API")
@RestController
public class HealthCheckController {
    @GetMapping()
    @Operation(summary = "Информация о доступности сервиса", description = "Информация о доступности сервиса")
    @ApiResponse(responseCode = "200", description = "Возвращает OK - 200")
    public ResponseEntity<String> get() {
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }

}
