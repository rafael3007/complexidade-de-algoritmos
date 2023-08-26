package br.edu.ifba.matrizes.impl;

import br.edu.ifba.matrizes.operacoes.Operacoes;

public class OperacoesImpl extends Operacoes<Integer> {

    @Override
    public Integer[][] multiplicar(Integer[][] matrizA, Integer[][] matrizB) {
        int m = matrizA.length;
        int n = matrizA[0].length;
        int p = matrizB[0].length;

        Integer[][] matriz = new Integer[m][p];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                matriz[i][j] = 0;

                for (int k = 0; k < n; k++) {
                    matriz[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        return matriz;
    }

}
