package com.example.airline.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "airline")
public class Airline {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAirline;

    @Column(name = "name")
    private String name;

    @Column(name = "airline_code")
    private String airlineCode;

    @Column(name = "country_of_origin")
    private String countryOfOrigin;

    // ID_Aerolínea (Clave Primaria)
    // Nombre
    // Código de aerolínea
    // País de origen
}
