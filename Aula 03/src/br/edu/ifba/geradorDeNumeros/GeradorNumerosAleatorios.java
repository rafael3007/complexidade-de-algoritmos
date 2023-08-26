package br.edu.ifba.geradorDeNumeros;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class GeradorNumerosAleatorios {
    public static List<Integer> gerarNumerosAleatorios(int quantidade) {
        Random random = new Random();
        List<Integer> numerosAleatorios = new ArrayList<>();

        for (int i = 0; i < quantidade; i++) {
            Integer numeroAleatorio = random.nextInt(); // Gera um número inteiro aleatório
            numerosAleatorios.add(numeroAleatorio);
        }

        return numerosAleatorios;
    }

    public static void main(String[] args) {
        int quantidadeNumeros = 10; // Altere essa quantidade conforme necessário
        List<Integer> numerosGerados = gerarNumerosAleatorios(quantidadeNumeros);

        System.out.println("Números Aleatórios Gerados:");
        for (Integer numero : numerosGerados) {
            System.out.println(numero);
        }
    }
}
