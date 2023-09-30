package br.edu.ifba.biometria.cenario2.models;

// constante, O(1)
public class Biometria {
    private int batimentos = 0;
    private int temperatura = 0;

    private String diagnostico = "";
    private int totalDePadroes = 0;

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

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public int getTotalDePadroes() {
        return totalDePadroes;
    }

    public void setTotalDePadroes(int totalDePadroes) {
        this.totalDePadroes = totalDePadroes;
    }

    @Override
    public String toString() {
        return "temperatura: " + temperatura + ", batimentos: " + batimentos;
    }

}
