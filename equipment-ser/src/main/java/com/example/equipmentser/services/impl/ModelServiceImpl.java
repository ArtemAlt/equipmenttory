package com.example.equipmentser.services.impl;

import com.example.equipmentser.entity.Model;
import com.example.equipmentser.repository.ModelRepository;
import com.example.equipmentser.services.interfaces.ModelService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class ModelServiceImpl implements ModelService {

    private final ModelRepository repository;
    @Override
    public Model getDefault() {
        return repository.getReferenceById(UUID.fromString("0a00a0a0-00a0-0000-a000-aa0a0a000a00"));
    }
}
