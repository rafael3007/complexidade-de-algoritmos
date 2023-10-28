## Continuação do algoritmo da aula 08 

package br.edu.ifba.coloracao;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.coloracao.estrategia.Estrategia;
import br.edu.ifba.coloracao.impl.EstrategiaImpl;

public class Mapa {

    enum Paises {
        BRAZIL(0, "Brazil"),
        GUIANA_FRANCESA(1, "Guiana Francesa"),
        SURINAME(2, "Suriname"),
        GUIANA(3, "Guiana"),
        VENEZUELA(4, "Venezuela"),
        COLOMBIA(5, "Colombia"),
        EQUADOR(6, "Equador"),
        PERU(7, "Peru"),
        BOLIVIA(8, "Bolívia"),
        PARAGUAI(9, "Paraguai"),
        URUGUAI(10, "Uruguai"),
        ARGENTINA(11, "Argentina"),
        CHILE(12, "Chile");

        public int vertice;
        public String nome;

        private Paises(int vertice, String nome) {
            this.vertice = vertice;
            this.nome = nome;
        }
    }

    private static final int TOTAL_DE_PAISES = 13;
    private static List<List<Integer>> mapa = null;

    private static final void iniciarMapa() {
        mapa = new ArrayList<>();
        for (int i = 0; i < TOTAL_DE_PAISES; i++) {
            mapa.add(new ArrayList<>());
        }
    }

    public static final void conectarPaises(Paises pais, Paises outroPais) {
        mapa.get(pais.vertice).add(outroPais.vertice);
        mapa.get(outroPais.vertice).add(pais.vertice);
    }

    public static void main(String[] args) {
        iniciarMapa();

        conectarPaises(Paises.BRAZIL, Paises.GUIANA_FRANCESA);
        conectarPaises(Paises.BRAZIL, Paises.SURINAME);
        conectarPaises(Paises.BRAZIL, Paises.GUIANA);
        conectarPaises(Paises.BRAZIL, Paises.VENEZUELA);
        conectarPaises(Paises.BRAZIL, Paises.COLOMBIA);
        conectarPaises(Paises.BRAZIL, Paises.PERU);
        conectarPaises(Paises.BRAZIL, Paises.BOLIVIA);
        conectarPaises(Paises.BRAZIL, Paises.PARAGUAI);
        conectarPaises(Paises.BRAZIL, Paises.URUGUAI);
        conectarPaises(Paises.BRAZIL, Paises.ARGENTINA);
        conectarPaises(Paises.BOLIVIA, Paises.PARAGUAI);
        conectarPaises(Paises.COLOMBIA, Paises.EQUADOR);
        conectarPaises(Paises.COLOMBIA, Paises.VENEZUELA);
        conectarPaises(Paises.COLOMBIA, Paises.PERU);
        conectarPaises(Paises.EQUADOR, Paises.PERU);
        conectarPaises(Paises.PERU, Paises.BOLIVIA);
        conectarPaises(Paises.PERU, Paises.CHILE);
        conectarPaises(Paises.CHILE, Paises.BOLIVIA);
        conectarPaises(Paises.CHILE, Paises.ARGENTINA);
        conectarPaises(Paises.ARGENTINA, Paises.BOLIVIA);
        conectarPaises(Paises.ARGENTINA, Paises.PARAGUAI);
        conectarPaises(Paises.ARGENTINA, Paises.URUGUAI);
        conectarPaises(Paises.SURINAME, Paises.GUIANA);
        conectarPaises(Paises.SURINAME, Paises.GUIANA_FRANCESA);
        conectarPaises(Paises.GUIANA, Paises.VENEZUELA);

        EstrategiaImpl estrateg
    
    }
    
}

