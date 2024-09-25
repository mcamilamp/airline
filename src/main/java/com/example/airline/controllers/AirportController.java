package com.example.airline.controllers;

import com.example.airline.models.Airport;
import com.example.airline.services.AirportService;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
