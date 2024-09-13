package com.example.airline.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.airline.models.Flight;

@Service
public interface FlightService {
    List<Flight> findAll();
    Optional<Flight> findFlightById(Long id);
    List<Flight> findFlightByName(String name);
    Flight createFlight(Flight flight);
    Optional<Flight> updateFlight(Long id, Flight newFlight);
    void deleteFlight(Long id);
}
