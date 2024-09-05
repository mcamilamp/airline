package com.example.airline.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.airline.models.Airline;

public interface AirlineRepository extends JpaRepository<Airline, Long>{
    
} 
