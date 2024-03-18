package com.botdincompany.pharmaAPI.service;

import com.botdincompany.pharmaAPI.entity.Medicine;

import java.util.List;

public interface MedicineServiceInterface {

    public Medicine findById(Long id);

    public Medicine findByName(String name);

    public Medicine addMedicine(Medicine medicine);

    public List<Medicine> findAllMedicines();

    public List<Medicine> searchForMedicine(Medicine medicine);
}
