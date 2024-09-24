package com.example.airline.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.airline.models.Airline;

@Service
public interface AirlineService {
    List<Airline> findAll();
    Optional<Airline> findAirlineById(Long id);
    List<Airline> findAirlineByName(String name);
    Airline createAirline(Airline airline);
    Optional<Airline> updateAirline(Long id, Airline newAirline);
    void deleteAirline(Long id);
    
}
