package br.edu.ifba.biometria.cenario2.borda.sensores;

public interface Sensores<Leitura> {

    public boolean temLeitura();

    public Leitura getLeitura();

}
