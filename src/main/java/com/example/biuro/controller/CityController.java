package com.example.biuro.controller;

import com.example.biuro.model.City;
import com.example.biuro.service.AirportService;
import com.example.biuro.service.CityService;
import com.example.biuro.service.CountryService;
import com.example.biuro.service.HotelService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class CityController {

    private final CityService cityService;
    private final CountryService countryService;
    private final AirportService airportService;
    private final HotelService hotelService;


    @GetMapping("/city")
    public String getCityList(Model model) {
        List<City> cityList = cityService.getCityList();
        model.addAttribute("city", cityList);
        model.addAttribute("airport", airportService.getAirportList());
        model.addAttribute("hotel", hotelService.getHotelList());
        model.addAttribute("country", countryService.getCountryList());
        return "city/city";
    }

}
