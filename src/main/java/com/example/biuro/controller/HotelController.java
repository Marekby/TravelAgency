package com.example.biuro.controller;

import com.example.biuro.model.City;
import com.example.biuro.model.Hotel;
import com.example.biuro.service.HotelService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class HotelController {

    private final HotelService hotelService;

    @GetMapping("/hotel")
    public String getHotelList(Model model) {
        List<Hotel> hotelList = hotelService.getHotelList();
        model.addAttribute("hotel", hotelList);
        return "city/city";
    }


}
