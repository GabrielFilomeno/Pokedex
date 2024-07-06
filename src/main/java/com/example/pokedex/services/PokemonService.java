package com.example.pokedex.services;

import com.example.pokedex.dtos.PokemonCapturadoRequest;
import com.example.pokedex.dtos.PokemonResponse;
import com.example.pokedex.dtos.PokemonVistoRequest;
import com.example.pokedex.entities.Pokemon;
import com.example.pokedex.repositories.PokemonRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import static com.example.pokedex.mappers.PokemonMapper.map;

@Service
public class PokemonService {

    private final PokemonRepository repository;

    public PokemonService(PokemonRepository pokemonRepository) {
        this.repository = pokemonRepository;
    }

    public void cadastrarVisto(PokemonVistoRequest pokemonVistoRequest) {
        if(repository.existsById(pokemonVistoRequest.getNumero())) {
            throw new DuplicateKeyException("Já existe um pokemon com esse número.");
        }
        repository.save(map(pokemonVistoRequest));
    }

    public void atualizaCapturado(PokemonCapturadoRequest pokemonCapturadoRequest) {
        if(!repository.existsById(pokemonCapturadoRequest.getNumero())) {
            throw new EntityNotFoundException();
        }
        repository.save(map(pokemonCapturadoRequest));
    }

    public void atualizaVisto(PokemonVistoRequest pokemonVistoRequest) {
        Pokemon pokemon = repository
                .findById(pokemonVistoRequest.getNumero())
                .orElseThrow(EntityNotFoundException::new);

        pokemon.setNome(pokemonVistoRequest.getNome());
        pokemon.setImagemUrl(pokemonVistoRequest.getImagemUrl());
        pokemon.setHabitat(pokemonVistoRequest.getHabitat());

        repository.save(pokemon);
    }

    public void deletar(Integer numero) {
        if (repository.existsById(numero)) {
        repository.deleteById(numero);
        } else {
            throw new EntityNotFoundException();
        }
    }

    public PokemonResponse buscar(Integer numero) {
        Pokemon pokemon = repository.findById(numero).orElseThrow(EntityNotFoundException::new);

        return map(pokemon);
    }
}
