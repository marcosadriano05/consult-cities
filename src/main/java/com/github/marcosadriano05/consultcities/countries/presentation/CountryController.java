package com.github.marcosadriano05.consultcities.countries.presentation;

import com.github.marcosadriano05.consultcities.countries.entities.Country;
import com.github.marcosadriano05.consultcities.countries.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private CountryRepository countryRepository;

    @GetMapping
    public Page<Country> getAllCountries(Pageable page) {
        return this.countryRepository.findAll(page);
    }

    @GetMapping("/{id}")
    public ResponseEntity getCountryById(@PathVariable Long id) {
        Optional<Country> optionalCountry = this.countryRepository.findById(id);
        if (!optionalCountry.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(optionalCountry.get());
    }
}
