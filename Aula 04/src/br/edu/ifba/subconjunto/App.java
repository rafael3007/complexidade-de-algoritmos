package br.edu.ifba.subconjunto;

import br.edu.ifba.subconjunto.impl.OperacoesImpl;
import br.edu.ifba.subconjunto.operacoes.Operacoes;

public class App {
    public static void main(String[] args) throws Exception {
        Operacoes<Integer> operacoes = new OperacoesImpl();

        Integer[] numeros = operacoes.gerarNumeros(1000);

        if (operacoes.encontrar(numeros, 9999999)) {
            System.out.println("Soma de subconjunto encontrada!");
        } else {
            System.out.println("soma de subconjunto não encontrada!");
        }
    }
}
