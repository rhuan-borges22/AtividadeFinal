package com.catalogo.model;

public class Artista extends Entidade {
    private String nome;
    private String genero;

    public Artista(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    // Método para exibir as informações do artista
    @Override
    public String toString() {
        return "Artista: " + nome + " - Gênero: " + genero;
    }
}
