package com.example.equipmentser.repository;


import com.example.equipmentser.entity.Dimensions;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DimensionRepository extends JpaRepository<Dimensions, UUID> {
}
