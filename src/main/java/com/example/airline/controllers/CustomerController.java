package com.example.airline.controllers;

import com.example.airline.models.Customer;
import com.example.airline.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {
    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Customer>> findAll() {
        return ResponseEntity.ok(customerService.findAll());
    }

    @GetMapping("/find/id/{id}")
    public ResponseEntity<Customer> findCustomerById(@PathVariable long id) {
        return ResponseEntity.ok(customerService.findCustomerById(id).orElse(null));
    }

    @GetMapping("/find/name/{name}")
    public ResponseEntity<List<Customer>> findCustomerByName(@PathVariable String name) {
        return ResponseEntity.ok(customerService.findCustomerByName(name));
    }

}
