package br.edu.ifba.busca;

import br.edu.ifba.busca.arvore.Arvore;
import br.edu.ifba.busca.arvore.No;
import br.edu.ifba.busca.impl.ArvoreImpl;

public class App {
    private static Arvore<Integer> arvore = null;

    public static Arvore<Integer> getInstacia() {
        if (arvore == null) {
            arvore = new ArvoreImpl();
        }

        return arvore;
    }

    public static void main(String[] args) throws Exception {

        int[] numeros = new int[] { 50, 30, 20, 90, 100, 5 };
        for (int numero : numeros) {
            getInstacia().inserir(numero);
        }

        // getInstacia().imprimir();

        No<Integer> resultado = getInstacia().buscar(200);
        if (resultado != null) {
            System.out.println("achei na árvore");
        } else {
            System.out.println("não achei na árvore");

        }
    }
}
