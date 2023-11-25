package br.edu.ifba.observer.impl;

import br.edu.ifba.observer.modelo.Nobreak;
import br.edu.ifba.observer.observador.Observador;

public class Mensageiro implements Observador {

    @Override
    public void atualizar(Nobreak nobreak) {
        if (nobreak.getBateria() <= 10) {
            System.out.println("avisando todo mundo");
        } else if (nobreak.getBateria() <= 50) {
            System.out.println("avisando o supervisor");
        } else if (nobreak.getBateria() <= 80) {
            System.out.println("avisando responsável direto");
        }
    }
    
}
