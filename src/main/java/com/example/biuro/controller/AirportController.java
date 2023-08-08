package com.example.biuro.controller;


import com.example.biuro.model.Airport;
import com.example.biuro.service.AirportService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class AirportController {

    private final AirportService airportService;

    @GetMapping("/airport")
    public String getAirportList(Model model) {
        List<Airport> airportList = airportService.getAirportList();
        model.addAttribute("airport", airportList);
        return "city/city";
    }
}
