package com.example.airline.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.airline.models.Stopover;

@Service
public interface StopoverService {
    List<Stopover> findAll();
    Optional<Stopover> findStopoverById(Long id);
    Stopover createStopover(Stopover stopover);
    Optional<Stopover> updateStopover(Long id, Stopover newStopover);
    void deleteStopover(Long id);
    
}