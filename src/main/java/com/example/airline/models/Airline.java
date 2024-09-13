package com.example.airline.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "airlines")
public class Airline {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_airline")
    private Long idAirline;

    @Column(name = "name")
    private String name;

    @Column(name = "airline_code")
    private String airlineCode;

    @Column(name = "country_of_origin")
    private String countryOfOrigin;

    // GETTERS AND SETTERS

    public Long getIdAirline() {
        return idAirline;
    }

    public void setIdAirline(Long idAirline) {
        this.idAirline = idAirline;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAirlineCode() {
        return airlineCode;
    }

    public void setAirlineCode(String airlineCode) {
        this.airlineCode = airlineCode;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    // ID_Aerolínea (Clave Primaria)
    // Nombre
    // Código de aerolínea
    // País de origen

    
}
