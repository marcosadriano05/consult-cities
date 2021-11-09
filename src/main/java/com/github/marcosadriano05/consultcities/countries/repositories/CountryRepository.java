package com.github.marcosadriano05.consultcities.countries.repositories;

import com.github.marcosadriano05.consultcities.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
