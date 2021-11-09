package com.github.marcosadriano05.consultcities.states.repositories;

import com.github.marcosadriano05.consultcities.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
