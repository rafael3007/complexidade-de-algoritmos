package br.edu.ifba.ordenacao;

public interface Ordenador<ordenavel> {
    public String getTipo();

    public void ordenar(ordenavel[] ordenaveis);
}
