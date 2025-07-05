package com.example.jpa_hibernate_and_springdatajpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.jpa_hibernate_and_springdatajpa.model.Country;
import com.example.jpa_hibernate_and_springdatajpa.service.CountryService;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @PostMapping
    public String addCountry(@RequestBody Country country) {
        countryService.addCountry(country);
        return "Country added successfully!";
    }
}
