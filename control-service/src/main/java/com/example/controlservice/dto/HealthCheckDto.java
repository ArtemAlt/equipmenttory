package com.example.controlservice.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
public class HealthCheckDto {
    private String serviceName;
    private String status;
}
