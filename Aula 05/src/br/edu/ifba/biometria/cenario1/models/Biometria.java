package br.edu.ifba.biometria.cenario1.models;

public class Biometria {
    private int batimentos = 0;
    private int temperatura = 0;

    public Biometria(int batimentos, int temperatura) {
        this.batimentos = batimentos;
        this.temperatura = temperatura;
    }

    public int getBatimentos() {
        return batimentos;
    }

    public void setBatimentos(int batimentos) {
        this.batimentos = batimentos;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return "Temperatura: " + temperatura + ", batimentos: " + batimentos;
    }
}