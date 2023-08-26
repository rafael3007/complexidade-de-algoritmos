package br.edu.ifba.busca.impl;

import java.util.Arrays;
import java.util.Random;
import br.edu.ifba.busca.generators.Numbers;

public class NumberImpl implements Numbers {

    @Override
    public int[] gerarVetor(int quantidade) {
        int vetor[] = new int[quantidade];

        // generate items for Array
        for (int i = 0; i < quantidade; i++) {
            vetor[i] = i;
        }

        Random sorteador = new Random();

        // Randomize the itens of Array
        for (int i = 0; i < quantidade; i++) {
            int indice = sorteador.nextInt(quantidade);

            int temp = vetor[i];
            vetor[i] = vetor[indice];
            vetor[indice] = temp;
        }

        return vetor;
    }

    @Override
    public int[] ordenarVetor(int[] numeros) {
        Arrays.sort(numeros);

        return numeros;
    }

}
