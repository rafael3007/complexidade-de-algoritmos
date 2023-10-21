package br.edu.ifba.coloracao;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.coloracao.estrategia.Estrategia;
import br.edu.ifba.coloracao.impl.EstrategiaImpl;

public class App {

    private static final int TOTAL_DE_VERTICES = 5;
    private static List<List<Integer>> grafo = null;

    public static final void iniciarGrafo() {
        grafo = new ArrayList<>();

        for (int i = 0; i < TOTAL_DE_VERTICES; i++) {
            grafo.add(new ArrayList<>());
        }
    }

    public static final void conectarVertices(int origem, int destino) {
        grafo.get(origem).add(destino);
        grafo.get(destino).add(origem);
    }

    public static void main(String[] args) throws Exception {
        iniciarGrafo();
        conectarVertices(0, 1);
        conectarVertices(0, 2);

        conectarVertices(1, 2);
        conectarVertices(1, 3);

        conectarVertices(2, 3);
        conectarVertices(3, 4);

        Estrategia<int[], List<List<Integer>>> estrategia = new EstrategiaImpl();
        String[] cores = estrategia.getCores(grafo, TOTAL_DE_VERTICES);

        for (int cor = 0; cor < cores.length; cor++) {
            System.out.println("cor do vértice [" + (cor + 1) + "] = " + cores[cor]);
        }

    }
}
