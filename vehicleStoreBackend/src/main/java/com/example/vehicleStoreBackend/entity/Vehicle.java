package com.example.vehicleStoreBackend.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brand;

    private String name;

    private Double price;

    private String fuelType;

    private String imageUrl;

    @Column(length = 2000)
    private String description;
}
