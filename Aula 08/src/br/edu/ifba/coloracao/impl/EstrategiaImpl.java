package br.edu.ifba.coloracao.impl;

import java.util.Arrays;
import java.util.List;

import br.edu.ifba.coloracao.estrategia.Estrategia;

public class EstrategiaImpl implements Estrategia<int[], List<List<Integer>>> {

    private static String[] CORES = new String[] { "branco", "preto", "cinza", "roxo", "azul", "vermelho", "amarelo",
            "laranja", "magenta", "rosa", "verde" };

    @Override
    public int[] colorir(List<List<Integer>> grafo, int totalDeVertices) {
        int[] cores = new int[totalDeVertices];
        Arrays.fill(cores, -1);
        cores[0] = 0;

        for (int vertice = 0; vertice < totalDeVertices; vertice++) {
            boolean[] coresUsadas = new boolean[totalDeVertices];

            // garantir que os vizinhos bnão tenham a mesma cor
            for (int vizinho : grafo.get(vertice)) {
                if (cores[vizinho] != -1) {
                    coresUsadas[cores[vizinho]] = true;
                }
            }

            for (int cor = 0; cor < totalDeVertices; cor++) {
                if (!coresUsadas[cor]) {
                    cores[vertice] = cor;

                    break;
                }
            }
        }

        return cores;
    }

    @Override
    public String[] getCores(List<List<Integer>> grafo, int totalDeVertices) throws Exception {
        int[] cores = colorir(grafo, totalDeVertices);

        if (cores.length > CORES.length) {
            throw new Exception("O grafo é maior que a quantidade de cores");
        }

        String[] nomesDasCores = new String[cores.length];
        int posicaoCor = 0;
        for (int cor : cores) {
            if (cor >= 0) {
                nomesDasCores[posicaoCor] = CORES[cor];
            } else {
                nomesDasCores[posicaoCor] = "sem cor";
            }
            posicaoCor++;
        }

        return nomesDasCores;
    }

}
