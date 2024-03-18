package com.botdincompany.pharmaAPI.entity;

import jakarta.persistence.*;

import java.lang.reflect.Field;
import java.util.Objects;

@Entity
public class Medicine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "base")
    private String medicineBase;

    @Column(name = "manufacturer")
    private String medicineManufacturer;

    @Column(name = "description")
    private String description;

    @Column(name = "side_effects")
    private String sideEffects;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMedicineBase() {
        return medicineBase;
    }

    public void setMedicineBase(String medicineBase) {
        this.medicineBase = medicineBase;
    }

    public String getMedicineManufacturer() {
        return medicineManufacturer;
    }

    public void setMedicineManufacturer(String medicineManufacturer) {
        this.medicineManufacturer = medicineManufacturer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSideEffects() {
        return sideEffects;
    }

    public void setSideEffects(String sideEffects) {
        this.sideEffects = sideEffects;
    }


    @Override
    public String toString() {

        StringBuilder stringValue = new StringBuilder();
         if(id != null)
         {
             stringValue.append(id.toString()).append(",name: ");
         }
         else{
             stringValue.append("null");
         }

         for (Field field : Medicine.class.getDeclaredFields())
         {
             if(field.getType().equals(String.class))
             {
                 field.setAccessible(true);
                 String string = ","+field.toString()+": ";
                 stringValue.append(string);
                 try{
                     stringValue.append(Objects.requireNonNullElse(field.get(this), "null"));
                 }
                 catch (Exception e)
                 {
                     System.out.println(e.getMessage());
                 }

             }
         }
        return stringValue.toString();
    }

    public void nullifyStrings()
    {

        for(Field field: Medicine.class.getDeclaredFields())
        {
            if(field.getType().equals(String.class))
            {
                field.setAccessible(true);
                try{
                    if(((String)field.get(this)).isEmpty())
                    {
                        field.set(this,null);
                    }
                }
                catch (Exception e)
                {
                    System.out.println(e.getMessage());
                }

            }
        }
//        if(name.isEmpty())
//        {
//            name = null;
//        }
//        if(medicineManufacturer.isEmpty())
//        {
//            name = null;
//        }
//        if(medicineBase.isEmpty())
//        {
//            name = null;
//        }
//        if(description.isEmpty())
//        {
//            name = null;
//        }
//        if(sideEffects.isEmpty())
//        {
//            sideEffects = null;
//        }
    }
}
