package br.edu.ifba.matrizes;

import br.edu.ifba.matrizes.impl.OperacoesImpl;
import br.edu.ifba.matrizes.operacoes.Operacoes;

public class App {
    public static void main(String[] args) {

        Integer[][] matrizA = new Integer[][] {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
        };

        Integer[][] matrizB = new Integer[][] {
                { 9, 8, 7 },
                { 6, 5, 4 },
                { 3, 2, 1 }
        };

        Operacoes<Integer> operacoes = new OperacoesImpl();

        Integer[][] matrizResultante = operacoes.multiplicar(matrizA, matrizB);

        operacoes.imprimir(matrizResultante);

    }
}
