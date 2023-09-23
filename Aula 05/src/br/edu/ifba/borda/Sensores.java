package br.edu.ifba.borda;

public interface Sensores<Leitura> {

    public boolean temLeitura();

    public Leitura getLeitura();
}
