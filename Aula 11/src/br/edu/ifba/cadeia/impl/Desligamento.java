package br.edu.ifba.cadeia.impl;

import br.edu.ifba.cadeia.modelo.Nobreak;
import br.edu.ifba.cadeia.observador.Observador;

public class Desligamento implements Observador {

    @Override
    public void atualizar(Nobreak nobreak) {
        if (nobreak.getBateria() <= 10) {
            System.out.println("realizando desligamento das máquinas");
        }
    }
    
}
