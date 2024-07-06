package com.example.pokedex.dtos;

import com.example.pokedex.enums.TipoEnum;
import jakarta.persistence.Column;

public class PokemonResponse {

    private Integer numero;
    private String nome;
    private String descricao;
    private String imagemUrl;
    private TipoEnum tipo;
    private String categoria;
    private String habitat;
    private Double altura;
    private Double peso;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getImagemUrl() {
        return imagemUrl;
    }

    public void setImagemUrl(String imagemUrl) {
        this.imagemUrl = imagemUrl;
    }

    public TipoEnum getTipo() {
        return tipo;
    }

    public void setTipo(TipoEnum tipo) {
        this.tipo = tipo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public boolean isFoiCapturado() {
        return foiCapturado;
    }

    public void setFoiCapturado(boolean foiCapturado) {
        this.foiCapturado = foiCapturado;
    }
}
