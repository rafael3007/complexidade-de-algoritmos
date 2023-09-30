package br.edu.ifba.biometria.cenario2.borda;

public interface Sensores<Leitura> {

    public boolean temLeitura();

    public Leitura getLeitura();

}
