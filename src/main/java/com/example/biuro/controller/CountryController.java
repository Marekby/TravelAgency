package com.example.biuro.controller;


import com.example.biuro.model.City;
import com.example.biuro.model.Country;
import com.example.biuro.service.CityService;
import com.example.biuro.service.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Controller
@RequiredArgsConstructor
public class CountryController {

    private final CountryService countryService;

    @GetMapping("/country")
    public String getCountryList(Model model) {
        List<Country> countryList = countryService.getCountryList();
        model.addAttribute("country", countryList);
        return "city/city";
    }


}
