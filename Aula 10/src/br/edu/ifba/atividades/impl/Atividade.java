package br.edu.ifba.atividades.impl;

public class Atividade {

    private int inicio;
    private int fim;

    public Atividade(int inicio, int fim) {
        this.inicio = inicio;
        this.fim = fim;
    }

    public int getInicio() {
        return inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public int getFim() {
        return fim;
    }

    public void setFim(int fim) {
        this.fim = fim;
    }

    @Override
    public String toString() {
        return "inicio: " + inicio + ", fim: " + fim;
    }

}
