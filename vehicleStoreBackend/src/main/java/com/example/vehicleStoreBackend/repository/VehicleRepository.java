package com.example.vehicleStoreBackend.repository;

import com.example.vehicleStoreBackend.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

    List<Vehicle> findByBrand(String brand);

    List<Vehicle> findByFuelType(String fuelType);

    List<Vehicle> findByPriceBetween(Double min, Double max);

    @Query("SELECT v.brand, COUNT(v) FROM Vehicle v GROUP BY v.brand")
    List<Object[]> getVehicleSummary();
}
