package com.example.controlservice.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "${app.location.name}", url = "${app.location.url}")
@Component
public interface LocationClient {
    @GetMapping( value = {"${app.location.health}"})
    ResponseEntity<String> checkAvailableService();


}
