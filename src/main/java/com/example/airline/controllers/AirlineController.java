package com.example.airline.controllers;

import com.example.airline.models.Airline;
import com.example.airline.services.AirlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/airlines")
public class AirlineController {
    private final AirlineService airlineService;

    @Autowired
    public AirlineController(AirlineService airlineService) {
        this.airlineService = airlineService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Airline>> findAll() {
        return ResponseEntity.ok(airlineService.findAll());
    }

    @GetMapping("/find/name/{name}")
    public ResponseEntity<List<Airline>> findAirlineByName(@PathVariable String name) {
        return ResponseEntity.ok(airlineService.findAirlineByName(name));
    }

    @GetMapping("/find/id/{id}")
    public ResponseEntity<Airline> findAirlineById(@PathVariable Long id) {
        return ResponseEntity.ok(airlineService.findAirlineById(id).orElse(null));
    }
}
