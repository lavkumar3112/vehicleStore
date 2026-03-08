package com.example.vehicleStoreBackend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName;

    private String customerEmail;

    private LocalDateTime bookingDate;

    @ManyToOne
    private Vehicle vehicle;
}
