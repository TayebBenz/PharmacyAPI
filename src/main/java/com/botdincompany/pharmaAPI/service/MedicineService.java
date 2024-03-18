package com.botdincompany.pharmaAPI.service;

import com.botdincompany.pharmaAPI.entity.Medicine;
import com.botdincompany.pharmaAPI.repository.MedicineRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;


@Service
public class MedicineService implements MedicineServiceInterface{

    private final MedicineRepository medicineRepository;


    public MedicineService(MedicineRepository medicineRepository) {
        this.medicineRepository = medicineRepository;
    }

    public Medicine findById(Long id)
    {
        return medicineRepository.findById(id).get();
    }

    public Medicine findByName(String name)
    {
        return medicineRepository.findByName(name);
    }

    public Medicine addMedicine(Medicine medicine)
    {
        medicineRepository.save(medicine);
        return medicine;
    }

    @Override
    public List<Medicine> findAllMedicines() {
        return medicineRepository.findAll();
    }

    @Override
    public List<Medicine> searchForMedicine(Medicine medicine) {

        medicine.nullifyStrings();
        ExampleMatcher exampleMatcher = ExampleMatcher.matchingAll().withIgnoreNullValues().withIgnoreCase().withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING);
        Example<Medicine> example = Example.of(medicine,exampleMatcher);

        return medicineRepository.findAll(example);
    }
}