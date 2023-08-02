package com.example.biuro.repository;

import com.example.biuro.model.Airport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirportRepository extends JpaRepository<Airport, Long> {
}
