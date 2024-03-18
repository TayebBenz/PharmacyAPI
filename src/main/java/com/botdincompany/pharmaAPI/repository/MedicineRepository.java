package com.botdincompany.pharmaAPI.repository;

import com.botdincompany.pharmaAPI.entity.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicineRepository extends JpaRepository<Medicine,Long> {

    public Medicine findByName(String name);
}
