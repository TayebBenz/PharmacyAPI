package com.botdincompany.pharmaAPI.controller;


import com.botdincompany.pharmaAPI.entity.Medicine;
import com.botdincompany.pharmaAPI.service.MedicineServiceInterface;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MedicineController {

    private final MedicineServiceInterface medicineServiceInterface;

    public MedicineController(MedicineServiceInterface medicineServiceInterface) {
        this.medicineServiceInterface = medicineServiceInterface;
    }

    @GetMapping("/medicine/id/{id}")
    public Medicine findById(@PathVariable("id") Long id)
    {
        return medicineServiceInterface.findById(id);
    }

    @GetMapping("/medicine/name/{name}")
    public Medicine findByName(@PathVariable("name") String name)
    {
        return medicineServiceInterface.findByName(name);
    }

    @PostMapping("/medicine/add")
    public Medicine addMedicine(@RequestBody Medicine medicine)
    {
        return medicineServiceInterface.addMedicine(medicine);
    }
    @GetMapping("/medicines")
    public List<Medicine> getAllMedicines()
    {
        return medicineServiceInterface.findAllMedicines();
    }

    @GetMapping("/medicine/search")
    public List<Medicine> searchForMedicine(@RequestBody Medicine medicine)
    {
        System.out.println(medicine);
        return medicineServiceInterface.searchForMedicine(medicine);
    }


}
