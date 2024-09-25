package com.example.airline.controllers;

import com.example.airline.models.Flight;
import com.example.airline.services.FlightService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/flights")
public class FlightController {
    private final FlightService flightService;

    @Autowired
    public FlightController(FlightService flightService) {this.flightService = flightService;}

    @GetMapping("/all")
    public ResponseEntity<List<Flight>> findAll() {
        return ResponseEntity.ok(flightService.findAll());
    }

    @PostMapping
    public ResponseEntity<Flight> createFlight(@RequestBody Flight flight) {
        return ResponseEntity.ok(flightService.createFlight(flight));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Flight> updateFlight(@PathVariable Long id, @RequestBody Flight newFlight) {
        return ResponseEntity.ok(flightService.updateFlight(id, newFlight).orElse(null));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFlight(@PathVariable Long id) {
        flightService.deleteFlight(id);
        return ResponseEntity.noContent().build();
    }
}
