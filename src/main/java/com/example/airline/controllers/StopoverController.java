package com.example.airline.controllers;

import com.example.airline.models.Stopover;
import com.example.airline.services.StopoverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/stopovers")
public class StopoverController {
    private final StopoverService stopoverService;

    @Autowired
    public StopoverController(StopoverService stopoverService) {this.stopoverService = stopoverService;}

    @GetMapping("/find/id/{id}")
    public ResponseEntity<Stopover> findStopoverById(@PathVariable Long id) {
        return ResponseEntity.ok(stopoverService.findStopoverById(id).orElse(null));
    }

    @PostMapping
    public ResponseEntity<Stopover> createStopover(@RequestBody Stopover stopover) {
        return ResponseEntity.ok(stopoverService.createStopover(stopover));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Stopover> updateStopover(@PathVariable Long id, @RequestBody Stopover stopover) {
        return stopoverService.updateStopover(id, stopover)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStopover(@PathVariable Long id) {
        stopoverService.deleteStopover(id);
        return ResponseEntity.noContent().build();
    }
}
