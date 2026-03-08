package com.example.vehicleStoreBackend.dto;

import lombok.Data;

@Data
public class BookingRequest {

    private Long vehicleId;
    private String customerName;
    private String customerEmail;

}
