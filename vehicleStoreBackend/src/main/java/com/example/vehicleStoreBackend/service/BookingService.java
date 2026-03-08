package com.example.vehicleStoreBackend.service;

import com.example.vehicleStoreBackend.entity.Booking;
import com.example.vehicleStoreBackend.entity.Vehicle;
import com.example.vehicleStoreBackend.repository.BookingRepository;
import com.example.vehicleStoreBackend.repository.VehicleRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class BookingService {

    private final BookingRepository bookingRepository;
    private final VehicleRepository vehicleRepository;

    public BookingService(BookingRepository bookingRepository, VehicleRepository vehicleRepository) {
        this.bookingRepository = bookingRepository;
        this.vehicleRepository = vehicleRepository;
    }

    public Booking createBooking(Long vehicleId, String name, String email) {

        Vehicle vehicle = vehicleRepository.findById(vehicleId)
                .orElseThrow(() -> new RuntimeException("Vehicle not found"));

        Booking booking = Booking.builder()
                .vehicle(vehicle)
                .customerName(name)
                .customerEmail(email)
                .bookingDate(LocalDateTime.now())
                .build();

        return bookingRepository.save(booking);
    }

    public List<Booking> getBookings() {
        return bookingRepository.findAll();
    }
}