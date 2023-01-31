package com.example.controlservice.service;

import com.example.controlservice.dto.HealthCheckDto;
import com.example.controlservice.dto.HealthCheckInfoDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HealthCheckBuilder {

    private List<HealthCheckDto> dtos;

    public HealthCheckBuilder() {
        this.dtos = new ArrayList<>();
    }

    public void registerStatus(String serviceName, String status){
        dtos.add(HealthCheckDto
                .builder()
                .serviceName(serviceName)
                .status(status)
                .build());
    }

    public HealthCheckInfoDto buildReport(){
        HealthCheckInfoDto infoDto = new HealthCheckInfoDto(dtos);
        clear();
        return infoDto;
    }

    private  void clear(){
        this.dtos = new ArrayList<>();
    }
}
