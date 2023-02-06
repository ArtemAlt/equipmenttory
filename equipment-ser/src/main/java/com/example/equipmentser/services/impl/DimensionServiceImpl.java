package com.example.equipmentser.services.impl;

import com.example.equipmentser.entity.Dimensions;
import com.example.equipmentser.repository.DimensionRepository;
import com.example.equipmentser.services.interfaces.DimensionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class DimensionServiceImpl implements DimensionService {
    private final DimensionRepository repository;
    @Override
    public Dimensions getDefault() {
        return repository.getReferenceById(UUID.fromString("0a00a0a0-00a0-0000-a000-aa0a0a000a00"));
    }
}
