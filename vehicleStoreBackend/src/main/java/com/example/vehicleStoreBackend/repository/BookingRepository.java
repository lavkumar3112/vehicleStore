package com.example.vehicleStoreBackend.repository;

import com.example.vehicleStoreBackend.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
