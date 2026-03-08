package com.example.vehicleStoreBackend.controller;

import com.example.vehicleStoreBackend.entity.Vehicle;
import com.example.vehicleStoreBackend.service.VehicleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {

    private final VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @GetMapping
    public List<Vehicle> getVehicles(
            @RequestParam(required = false) String brand,
            @RequestParam(required = false) String fuelType,
            @RequestParam(required = false) Double minPrice,
            @RequestParam(required = false) Double maxPrice
    ) {
        return vehicleService.getVehicles(brand, fuelType, minPrice, maxPrice);
    }

    @GetMapping("/{id}")
    public Vehicle getVehicle(@PathVariable Long id) {
        return vehicleService.getVehicle(id);
    }

    @PostMapping
    public Vehicle addVehicle(@RequestBody Vehicle vehicle) {
        return vehicleService.addVehicle(vehicle);
    }

    @GetMapping("/summary")
    public List<Object[]> summary() {
        return vehicleService.getSummary();
    }
}