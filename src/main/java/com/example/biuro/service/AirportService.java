package com.example.biuro.service;
import com.example.biuro.model.Airport;
import com.example.biuro.repository.AirportRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AirportService {

    private final AirportRepository airportRepository;

    public List<Airport> getAirportList(){
        return airportRepository.findAll();
    }

    public Airport getAirportById(Long id){
        return airportRepository.findById(id).orElse(null);
    }
}
