package com.example.equipmentser.repository;

import com.example.equipmentser.entity.DimensionFeature;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface DimensionFeatureRepository extends JpaRepository<DimensionFeature, UUID> {
}
