package com.example.equipment.repository;

import com.example.equipment.entity.DimensionFeature;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DimensionFeatureRepository extends JpaRepository<DimensionFeature, UUID> {
}
