package br.edu.ifba.algoritmoDijsktra.estrategia;

public interface Estrategia<Distancias, Mapa, Origem> {
    public Distancias encontrarMenorDistancia(Mapa mapa, Origem origem);

}
