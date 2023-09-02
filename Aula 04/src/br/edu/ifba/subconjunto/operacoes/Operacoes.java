package br.edu.ifba.subconjunto.operacoes;

public interface Operacoes<Numero> {
    public Numero[] gerarNumeros(int totalNumeros);

    public boolean encontrar(Numero[] numeros, Numero soma);
}
