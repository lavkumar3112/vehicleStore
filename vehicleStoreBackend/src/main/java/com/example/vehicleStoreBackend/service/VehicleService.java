package com.example.vehicleStoreBackend.service;

import com.example.vehicleStoreBackend.entity.Vehicle;
import com.example.vehicleStoreBackend.repository.VehicleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {

    private final VehicleRepository vehicleRepository;

    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public List<Vehicle> getVehicles(String brand, String fuelType, Double minPrice, Double maxPrice) {

        if (brand != null) {
            return vehicleRepository.findByBrand(brand);
        }

        if (fuelType != null) {
            return vehicleRepository.findByFuelType(fuelType);
        }

        if (minPrice != null && maxPrice != null) {
            return vehicleRepository.findByPriceBetween(minPrice, maxPrice);
        }

        return vehicleRepository.findAll();
    }

    public Vehicle getVehicle(Long id) {
        return vehicleRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Vehicle not found"));
    }

    public Vehicle addVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    public List<Object[]> getSummary() {
        return vehicleRepository.getVehicleSummary();
    }
}