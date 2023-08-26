package br.edu.ifba.ordenacao.impl;

import br.edu.ifba.ordenacao.Ordenador;

public class Merge implements Ordenador<Integer> {

    @Override
    public String getTipo() {
        return "merge sort";
    }

    @Override
    public void ordenar(Integer[] vetor) {
        if (vetor == null || vetor.length == 0) {
            return;
        }

        ordenar(vetor, 0, vetor.length - 1);
    }

    private void ordenar(Integer[] vetor, Integer esquerda, Integer direita) {
        if (esquerda >= direita) {
            return;
        }

        int meio = (esquerda + direita) / 2;
        ordenar(vetor, esquerda, meio);
        ordenar(vetor, meio + 1, direita);

        juntar(vetor, esquerda, meio, direita);
    }

    private void juntar(Integer[] vetor, int esquerda, int meio, int direita) {
        int[] temp = new int[direita - esquerda + 1];
        int i = esquerda, j = meio + 1, k = 0;
        while (i <= meio && j <= direita) {
            if (vetor[i] <= vetor[j]) {
                temp[k++] = vetor[i++];
            } else {
                temp[k++] = vetor[j++];
            }
        }
        while (i <= meio) {
            temp[k++] = vetor[i++];
        }
        while (j <= direita) {
            temp[k++] = vetor[j++];
        }
        for (int l = 0; l < temp.length; l++) {
            vetor[esquerda + l] = temp[l];
        }
    }
}
