package com.example.equipmentser.repository;


import com.example.equipmentser.entity.Feature;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface FeatureRepository extends JpaRepository<Feature, UUID> {
}
