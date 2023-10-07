package br.edu.ifba.oficina;

// public record ParametrosDeCalculo (boolean trocarOleo){}
public class ParametrosDeCalculo {
    private boolean trocarOleo = false;
    private boolean alinhamento = false;
    private boolean limpezaAr = false;
    private String[] adicionais = new String[] {};
    private double desconto = .0;

    public ParametrosDeCalculo(boolean trocarOleo, boolean alinhamento, boolean limpezaAr) {
        this.trocarOleo = trocarOleo;
        this.alinhamento = alinhamento;
        this.limpezaAr = limpezaAr;
    }

    public boolean isTrocarOleo() {
        return trocarOleo;
    }

    public void setTrocarOleo(boolean trocarOleo) {
        this.trocarOleo = trocarOleo;
    }

    public boolean isAlinhamento() {
        return alinhamento;
    }

    public void setAlinhamento(boolean alinhamento) {
        this.alinhamento = alinhamento;
    }

    public boolean isLimpezaAr() {
        return limpezaAr;
    }

    public void setLimpezaAr(boolean limpezaAr) {
        this.limpezaAr = limpezaAr;
    }

    public String[] getAdicionais() {
        return adicionais;
    }

    public void setAdicionais(String[] adicionais) {
        this.adicionais = adicionais;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

}