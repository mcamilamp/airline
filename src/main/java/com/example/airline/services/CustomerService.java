package com.example.airline.services;

import com.example.airline.models.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CustomerService {
    List<Customer> findAll();
    Optional<Customer> findCustomerById(Long id);
    List<Customer>findCustomerByName(String name);
    Customer createCustomer(Customer customer);
    Optional<Customer> updateCustomer(Long id, Customer newCustomer);
    void deleteCustomer(Long id);
} 
