package com.github.marcosadriano05.consultcities.cities.presentation;

import com.github.marcosadriano05.consultcities.cities.entities.City;
import com.github.marcosadriano05.consultcities.cities.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cities")
public class CityController {

    @Autowired
    private CityRepository cityRepository;

    @GetMapping
    public Page<City> getAllCities(Pageable page) {
        return this.cityRepository.findAll(page);
    }
}
