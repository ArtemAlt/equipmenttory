package com.example.controlservice.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "${app.equipment.name}", url = "${app.equipment.url}")
@Component
public interface EquipmentClient {
    @GetMapping( value = {"${app.equipment.health}"})
    ResponseEntity<String> checkAvailableService();

}
