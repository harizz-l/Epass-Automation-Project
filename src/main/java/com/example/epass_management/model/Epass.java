package com.example.epass_management.model;

import jakarta.persistence.*;
        import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Epass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String vehicleNumber;
    private String mobileNumber;
    private String aadharNumber;
    private String placeToVisit;

    private LocalDate dateIn;
    private LocalDate dateOut;
    private LocalDateTime createdAt = LocalDateTime.now();

    // --- Getters and Setters ---
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getVehicleNumber() { return vehicleNumber; }
    public void setVehicleNumber(String vehicleNumber) { this.vehicleNumber = vehicleNumber; }

    public String getMobileNumber() { return mobileNumber; }
    public void setMobileNumber(String mobileNumber) { this.mobileNumber = mobileNumber; }

    public String getAadharNumber() { return aadharNumber; }
    public void setAadharNumber(String aadharNumber) { this.aadharNumber = aadharNumber; }

    public String getPlaceToVisit() { return placeToVisit; }
    public void setPlaceToVisit(String placeToVisit) { this.placeToVisit = placeToVisit; }

    public LocalDate getDateIn() { return dateIn; }
    public void setDateIn(LocalDate dateIn) { this.dateIn = dateIn; }

    public LocalDate getDateOut() { return dateOut; }
    public void setDateOut(LocalDate dateOut) { this.dateOut = dateOut; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
}