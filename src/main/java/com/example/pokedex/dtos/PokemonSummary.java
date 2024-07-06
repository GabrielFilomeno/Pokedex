package com.example.pokedex.dtos;

public class PokemonSummary {

    private Integer numero;
    private String nome;
    private boolean foiCapturado;

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isFoiCapturado() {
        return foiCapturado;
    }

    public void setFoiCapturado(boolean foiCapturado) {
        this.foiCapturado = foiCapturado;
    }
}
