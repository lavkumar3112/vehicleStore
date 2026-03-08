package com.example.vehicleStoreBackend.service;

import com.example.vehicleStoreBackend.entity.Bookmark;
import com.example.vehicleStoreBackend.entity.Vehicle;
import com.example.vehicleStoreBackend.repository.BookmarkRepository;
import com.example.vehicleStoreBackend.repository.VehicleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookmarkService {

    private final BookmarkRepository bookmarkRepository;
    private final VehicleRepository vehicleRepository;

    public BookmarkService(BookmarkRepository bookmarkRepository, VehicleRepository vehicleRepository) {
        this.bookmarkRepository = bookmarkRepository;
        this.vehicleRepository = vehicleRepository;
    }

    public Bookmark addBookmark(Long vehicleId) {

        Vehicle vehicle = vehicleRepository.findById(vehicleId)
                .orElseThrow(() -> new RuntimeException("Vehicle not found"));

        Bookmark bookmark = Bookmark.builder()
                .vehicle(vehicle)
                .build();

        return bookmarkRepository.save(bookmark);
    }

    public List<Bookmark> getBookmarks() {
        return bookmarkRepository.findAll();
    }

    public void deleteBookmark(Long id) {
        bookmarkRepository.deleteById(id);
    }
}
