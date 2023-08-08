package com.example.biuro.service;

import com.example.biuro.model.City;
import com.example.biuro.repository.CityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CityService {

    private final CityRepository cityRepository;

    public List<City> getCityList(){
        return cityRepository.findAll();
    }

    public City getCityById(Long id){
        return cityRepository.findById(id).orElse(null);
    }

}
