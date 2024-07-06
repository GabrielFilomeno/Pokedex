package com.example.pokedex.mappers;

import com.example.pokedex.dtos.PokemonCapturadoRequest;
import com.example.pokedex.dtos.PokemonResponse;
import com.example.pokedex.dtos.PokemonVistoRequest;
import com.example.pokedex.entities.Pokemon;

public class PokemonMapper {

    private PokemonMapper(){}

    public static Pokemon map(PokemonVistoRequest source) {
        if (source == null) return null;

        Pokemon target = new Pokemon();

        target.setNumero(source.getNumero());
        target.setNome(source.getNome());
        target.setImagemUrl(source.getImagemUrl());
        target.setHabitat(source.getHabitat());

        return target;
    }

    public static Pokemon map(PokemonCapturadoRequest source) {
        if (source == null) return null;

        Pokemon target = new Pokemon();

        target.setNumero(source.getNumero());
        target.setNome(source.getNome());
        target.setDescricao(source.getDescricao());
        target.setImagemUrl(source.getImagemUrl());
        target.setTipo(source.getTipo());
        target.setCategoria(source.getCategoria());
        target.setHabitat(source.getHabitat());
        target.setAltura(source.getAltura());
        target.setPeso(source.getPeso());
        target.setFoiCapturado(true);

        return target;
    }
    public static PokemonResponse map(Pokemon source) {
        if (source == null) return null;

        PokemonResponse target = new PokemonResponse();

        target.setNumero(source.getNumero());
        target.setNome(source.getNome());
        target.setDescricao(source.getDescricao());
        target.setImagemUrl(source.getImagemUrl());
        target.setTipo(source.getTipo());
        target.setCategoria(source.getCategoria());
        target.setHabitat(source.getHabitat());
        target.setAltura(source.getAltura());
        target.setPeso(source.getPeso());
        target.setFoiCapturado(source.isFoiCapturado());

        return target;
    }
}
