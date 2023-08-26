package br.edu.ifba.ordenacao.Merge;

import br.edu.ifba.ordenacao.Ordenador;

// import java.util.List;

// import br.edu.ifba.geradorDeNumeros.GeradorNumerosAleatorios;
import br.edu.ifba.ordenacao.impl.Merge;

public class App {
    // private static final int quantidadeNumeros = 100;
    public static void main(String[] args) throws Exception {

        // List<Integer> Numeros =
        // GeradorNumerosAleatorios.gerarNumerosAleatorios(quantidadeNumeros);

        Integer[] numeros = new Integer[] { 127, 124, 3, 12, 41, 24, 125, 3, 534, 58, 69, 7, 908, 43, 5, 3425, 8, 6 };

        Ordenador<Integer> ordenador = new Merge();

        ordenador.ordenar(numeros);

        for (Integer numero : numeros) {
            System.out.println(numero);
        }
    }
}
