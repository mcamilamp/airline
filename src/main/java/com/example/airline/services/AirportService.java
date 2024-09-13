package com.example.airline.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.airline.models.Airport;

@Service
public interface AirportService {
    List<Airport> findAll();
    Optional<Airport> findAirportById(Long id);
    List<Airport> findAirportByName(String name);
    Airport createAirport(Airport airport);
    Optional<Airport> updateAirport(Long id, Airport newAirport);
    void deleteAirport(Long id);
}
