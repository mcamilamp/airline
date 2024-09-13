package com.example.airline.repositories;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.airline.models.Airline;

public interface AirlineRepository extends JpaRepository<Airline, Long>{

    List<Airline> findAirlineByName(String name);
    
} 
