package com.example.jpa_hibernate_and_springdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.jpa_hibernate_and_springdatajpa.model.Country;

public interface CountryRepository extends JpaRepository<Country, String> {
}
