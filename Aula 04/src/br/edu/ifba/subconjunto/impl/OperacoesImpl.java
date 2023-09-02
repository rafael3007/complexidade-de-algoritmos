package br.edu.ifba.subconjunto.impl;

import java.util.Random;

import br.edu.ifba.subconjunto.operacoes.Operacoes;

public class OperacoesImpl implements Operacoes<Integer> {

    @Override
    public Integer[] gerarNumeros(int totalNumeros) {
        Integer[] numeros = new Integer[totalNumeros];

        Random randomizador = new Random();
        for (int i = 0; i < totalNumeros; i++) {
            numeros[i] = randomizador.nextInt(Integer.MAX_VALUE);
        }

        return numeros;
    }

    @Override
    public boolean encontrar(Integer[] numeros, Integer soma) {
        return encontrar(numeros, soma, 0);
    }

    public boolean encontrar(Integer[] numeros, Integer soma, Integer posicao) {
        if (soma == 0) {
            return true;
        }
        if (posicao == numeros.length) {
            return false;
        }

        return encontrar(numeros, soma - numeros[posicao], posicao + 1) || encontrar(numeros, soma, posicao + 1);
    }

}
