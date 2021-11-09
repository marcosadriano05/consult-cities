package com.github.marcosadriano05.consultcities.states.presentation;

import com.github.marcosadriano05.consultcities.states.entities.State;
import com.github.marcosadriano05.consultcities.states.repositories.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/states")
public class StateController {

    @Autowired
    private StateRepository stateRepository;

    @GetMapping
    public List<State> getAllStates() {
        return this.stateRepository.findAll();
    }
}
