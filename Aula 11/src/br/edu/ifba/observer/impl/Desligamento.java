package br.edu.ifba.observer.impl;

import br.edu.ifba.observer.modelo.Nobreak;
import br.edu.ifba.observer.observador.Observador;

public class Desligamento implements Observador {

    @Override
    public void atualizar(Nobreak nobreak) {
        if (nobreak.getBateria() <= 10) {
            System.out.println("Realizando desligamento das máquinas!");
        }
    }

}
