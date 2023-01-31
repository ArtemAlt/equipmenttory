package com.example.controlservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
public class HealthCheckInfoDto {
    private List<HealthCheckDto> info;
}
