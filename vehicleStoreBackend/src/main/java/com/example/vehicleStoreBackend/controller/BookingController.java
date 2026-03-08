package com.example.vehicleStoreBackend.controller;

import com.example.vehicleStoreBackend.dto.BookingRequest;
import com.example.vehicleStoreBackend.entity.Booking;
import com.example.vehicleStoreBackend.service.BookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {

    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping
    public Booking createBooking(@RequestBody BookingRequest request) {
        return bookingService.createBooking(
                request.getVehicleId(),
                request.getCustomerName(),
                request.getCustomerEmail()
        );
    }

    @GetMapping
    public List<Booking> getBookings() {
        return bookingService.getBookings();
    }
}
