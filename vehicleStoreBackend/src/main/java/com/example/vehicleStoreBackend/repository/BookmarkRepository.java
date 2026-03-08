package com.example.vehicleStoreBackend.repository;

import com.example.vehicleStoreBackend.entity.Bookmark;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {
}
