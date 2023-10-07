package br.edu.ifba.algoritmoDijsktra.impl;

import java.util.Arrays;
import java.util.PriorityQueue;

import br.edu.ifba.algoritmoDijsktra.estrategia.Estrategia;

public class Dijkstra implements Estrategia<int[], int[][], Integer> {

    @Override
    public int[] encontrarMenorDistancia(int[][] mapa, Integer origem) {
        int[] distancias = new int[mapa.length];
        Arrays.fill(distancias, Integer.MAX_VALUE);

        distancias[origem] = 0;

        PriorityQueue<Integer> fila = new PriorityQueue<>(
                (a, b) -> distancias[a] - distancias[b]);

        fila.offer(origem);

        while (!fila.isEmpty()) {
            int estrada = fila.poll();

            for (int i = 0; i < mapa.length; i++) {
                if (mapa[estrada][i] != 0) {
                    int distanciaAcumulada = distancias[estrada] + mapa[estrada][i];

                    if (distanciaAcumulada < distancias[i]) {
                        distancias[i] = distanciaAcumulada;
                        fila.offer(i);
                    }
                }
            }
        }

        return distancias;
    }

}
