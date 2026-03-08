package com.example.vehicleStoreBackend.controller;

import com.example.vehicleStoreBackend.dto.BookmarkRequest;
import com.example.vehicleStoreBackend.entity.Bookmark;
import com.example.vehicleStoreBackend.service.BookmarkService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookmarks")
public class BookmarkController {

    private final BookmarkService bookmarkService;

    public BookmarkController(BookmarkService bookmarkService) {
        this.bookmarkService = bookmarkService;
    }

    @PostMapping
    public Bookmark addBookmark(@RequestBody BookmarkRequest request) {
        return bookmarkService.addBookmark(request.getVehicleId());
    }

    @GetMapping
    public List<Bookmark> getBookmarks() {
        return bookmarkService.getBookmarks();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        bookmarkService.deleteBookmark(id);
    }
}
