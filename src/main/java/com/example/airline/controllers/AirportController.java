package com.example.airline.controllers;

import com.example.airline.models.Airport;
import com.example.airline.services.AirportService;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/v1/airports")
public class AirportController {
    private final AirportService airportService;

    @Autowired
    public AirportController(AirportService airportService) {
        this.airportService = airportService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Airport>> findAll() {
        return ResponseEntity.ok(airportService.findAll());
    }

    @GetMapping("/find/name/{name}")
    public ResponseEntity<List<Airport>> findAirportByName(@PathVariable String name) {
        return ResponseEntity.ok(airportService.findAirportByName(name));
    }

    @GetMapping("/find/name/{id}")
    public ResponseEntity<Airport> findAirportById(@PathVariable Long id) {
        return ResponseEntity.ok(airportService.findAirportById(id).orElse(null));
    }

    @PostMapping
    public ResponseEntity<Airport> createAirport(@RequestBody Airport airport) {
        return ResponseEntity.ok(airportService.createAirport(airport));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Airport> updateAirport(@PathVariable Long id, @RequestBody Airport newAirport) {
        return airportService.updateAirport(id, newAirport)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAirport(@PathVariable Long id) {
        airportService.deleteAirport(id);
        return ResponseEntity.noContent().build();
    }
}
