package com.catalogo;

import com.catalogo.model.Artista;
import com.catalogo.model.Disco;

public class Main {
    public static void main(String[] args) {

        Artista artista1 = new Artista("The Beatles", "Rock");
        artista1.setId(1);

        Artista artista2 = new Artista("Pink Floyd", "Progressive Rock");
        artista2.setId(2);


        Disco disco1 = new Disco("Abbey Road", 1969, artista1.getId());
        disco1.setId(1);

        Disco disco2 = new Disco("The Dark Side of the Moon", 1973, artista2.getId());
        disco2.setId(2);


        System.out.println(artista1);
        System.out.println(artista2);
        System.out.println(disco1);
        System.out.println(disco2);
    }
}
