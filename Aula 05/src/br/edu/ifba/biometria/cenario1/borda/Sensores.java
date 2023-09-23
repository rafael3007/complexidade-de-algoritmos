package br.edu.ifba.biometria.cenario1.borda;

public interface Sensores<Leitura> {

    public boolean temLeitura();

    public Leitura getLeitura();

}
