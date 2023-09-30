package br.edu.ifba.biometria.cenario2.nuvem.atuador;

import java.util.List;

public interface Atuador<Leitura, Resultado> {
    // complixidade constate
    Resultado atuar(List<Leitura> leituras);

}
