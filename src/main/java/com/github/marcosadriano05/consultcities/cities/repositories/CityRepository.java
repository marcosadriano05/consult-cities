package com.github.marcosadriano05.consultcities.cities.repositories;

import com.github.marcosadriano05.consultcities.cities.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}
