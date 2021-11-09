package com.github.marcosadriano05.consultcities.countries.presentation;

import com.github.marcosadriano05.consultcities.countries.entities.Country;
import com.github.marcosadriano05.consultcities.countries.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private CountryRepository countryRepository;

    @GetMapping
    public List<Country> getAllCountries() {
        return this.countryRepository.findAll();
    }
}
