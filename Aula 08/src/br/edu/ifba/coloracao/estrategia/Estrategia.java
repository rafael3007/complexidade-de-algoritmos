package br.edu.ifba.coloracao.estrategia;

import java.util.List;

public interface Estrategia<Cores, Grafo> {
    public Cores colorir(Grafo grafo, int totalDeVertices);

    public String[] getCores(List<List<Integer>> grafo, int totalDeVertices) throws Exception;
}
