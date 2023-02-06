package com.example.equipmentser.repository;
import com.example.equipmentser.entity.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface ManufacturerRepository extends JpaRepository<Manufacturer, UUID> {
}
