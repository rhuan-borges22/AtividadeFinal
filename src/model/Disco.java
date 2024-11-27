package com.catalogo.model;

public class Disco extends Entidade {
    private String titulo;
    private int anoLancamento;
    private int artistaId;

    public Disco(String titulo, int anoLancamento, int artistaId) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.artistaId = artistaId;
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getArtistaId() {
        return artistaId;
    }

    public void setArtistaId(int artistaId) {
        this.artistaId = artistaId;
    }

    // Método para exibir as informações do disco
    @Override
    public String toString() {
        return "Disco: " + titulo + " - Ano: " + anoLancamento + " - Artista ID: " + artistaId;
    }
}
