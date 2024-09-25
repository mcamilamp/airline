package com.example.airline.controllers;

import com.example.airline.models.Customer;
import com.example.airline.models.Flight;
import com.example.airline.services.FlightService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/find/id/{id}")
    public ResponseEntity<Flight> findFlightById(@PathVariable long id) {
        return ResponseEntity.ok(flightService.findFlightById(id).orElse(null));
    }

}
