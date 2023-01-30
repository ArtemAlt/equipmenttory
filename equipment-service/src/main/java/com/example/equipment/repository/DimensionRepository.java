package com.example.equipment.repository;

import com.example.equipment.entity.Dimensions;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DimensionRepository extends JpaRepository<Dimensions, UUID> {
}
