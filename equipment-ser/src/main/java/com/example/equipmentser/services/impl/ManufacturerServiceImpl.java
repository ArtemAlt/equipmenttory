package com.example.equipmentser.services.impl;

import com.example.equipmentser.entity.Manufacturer;
import com.example.equipmentser.repository.ManufacturerRepository;
import com.example.equipmentser.services.interfaces.ManufacturerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class ManufacturerServiceImpl implements ManufacturerService {
    private final ManufacturerRepository repository;
    @Override
    public Manufacturer getDefault() {
        return repository.getReferenceById(UUID.fromString("0a00a0a0-00a0-0000-a000-aa0a0a000a00"));
    }
}
