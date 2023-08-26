package br.edu.ifba.matrizes.operacoes;

public abstract class Operacoes<Tipo> {
    public void imprimir(Tipo[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "");
                System.out.println();
            }
        }
    }

    public abstract Tipo[][] multiplicar(Tipo[][] matrizA, Tipo[][] matrizB);

}
