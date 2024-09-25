package com.example.airline.controllers;

import com.example.airline.services.StopoverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/stopovers")
public class StopoverController {
    private final StopoverService stopoverService;

    @Autowired
    public StopoverController(StopoverService stopoverService) {this.stopoverService = stopoverService;}

}
