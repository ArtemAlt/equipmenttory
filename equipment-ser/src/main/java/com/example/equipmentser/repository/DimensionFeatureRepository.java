package com.example.equipmentser.repository;

import com.example.equipmentser.entity.DimensionFeature;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DimensionFeatureRepository extends JpaRepository<DimensionFeature, UUID> {
}
