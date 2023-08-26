package br.edu.ifba.ordenacao.Bubble;

import br.edu.ifba.ordenacao.Ordenador;
import br.edu.ifba.ordenacao.impl.Bubble;

public class App_ {
    public static void main(String[] args) throws Exception {
        Integer[] numeros = new Integer[] { 10, 2, 100, 70, 33, 20, 17, 1000 };

        // Ordenador<Integer> ordenador = new Merge();
        Ordenador<Integer> ordenador = new Bubble();
        ordenador.ordenar(numeros);

        for (Integer numero : numeros) {
            System.out.println(numero);
        }

    }
}
