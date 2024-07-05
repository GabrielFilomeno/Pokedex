package com.example.pokedex.controllers;

import com.example.pokedex.dtos.PokemonCapturadoRequest;
import com.example.pokedex.dtos.PokemonVistoRequest;
import com.example.pokedex.services.PokemonService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {

    private final PokemonService service;

    public  PokemonController(PokemonService pokemonService) {
        this.service = pokemonService;
    }

    @PostMapping("/visto")
    @ResponseStatus(HttpStatus.CREATED)
    public void cadastrarVisto(@Valid  @RequestBody PokemonVistoRequest pokemonVistoRequest) {
        service.cadastrarVisto(pokemonVistoRequest);
    }

    @PutMapping("/capturado")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void atualizaCapturado(@Valid @RequestBody PokemonCapturadoRequest pokemonCapturadoRequest) {
        service.atualizaCapturado(pokemonCapturadoRequest);
    }

    @PutMapping("/visto")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void atualizaVisto(@Valid @RequestBody PokemonVistoRequest pokemonVistoRequest) {
        service.atualizaVisto(pokemonVistoRequest);
    }
}
