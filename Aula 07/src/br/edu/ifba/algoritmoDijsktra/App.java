package br.edu.ifba.algoritmoDijsktra;

import br.edu.ifba.algoritmoDijsktra.impl.Dijkstra;

public class App {

    private static final int TOTAL_DE_CIDADES = 6;

    public static void main(String[] args) {
        int[][] mapa = new int[TOTAL_DE_CIDADES][TOTAL_DE_CIDADES];

        mapa[0][1] = 2;
        mapa[0][2] = 4;

        mapa[1][2] = 1;
        mapa[1][3] = 7;

        mapa[2][3] = 3;
        mapa[2][4] = 2;

        mapa[3][4] = 5;

        mapa[4][5] = 3;

        Integer origem = 0;
        int[] distancias = new Dijkstra().encontrarMenorDistancia(mapa, origem);

        for (int i = 0; i < TOTAL_DE_CIDADES; i++) {
            if (origem == i) {
                System.out.println(" Cidade de origem: " + i);
            } else {
                System.out.println("Até a cidade " + i + " a menor distancia é: " + distancias[i]);
            }
        }

    }

}
