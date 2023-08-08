package com.example.biuro.service;


import com.example.biuro.model.City;
import com.example.biuro.model.Country;
import com.example.biuro.repository.CityRepository;
import com.example.biuro.repository.CountryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class CountryService {
    private final CountryRepository countryRepository;

   public List<Country> getCountryList() {
       return countryRepository.findAll();
   }

    public Country getCountryById(Long id){
        return countryRepository.findById(id).orElse(null);
    }

}
