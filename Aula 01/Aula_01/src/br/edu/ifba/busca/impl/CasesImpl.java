package br.edu.ifba.busca.impl;

import br.edu.ifba.busca.cases.Cases;

public class CasesImpl extends Cases {

    @Override
    public boolean detectarMelhorCaso() {
        boolean detectado = false;

        for (int i = 0; i < vetor.length / 3; i++) {
            if (numero == vetor[i]) {
                detectado = true;
                break;
            }
        }

        return detectado;
    }

    @Override
    public boolean detectarCasoMedio() {
        boolean detectado = false;
        // int TwoeHalfThreePart = vetor.length - (vetor.length/3);

        for (int i = 0 ; i < vetor.length; i++) {
            if (numero == vetor[i]) {
                detectado = true;
                break;
            }
        }

        return detectado;
    }

    @Override
    public boolean detectarPiorCaso() {
        boolean detectado = true;

        for (int i = 0; i < vetor.length; i++) {
            if (numero == vetor[i]) {
                detectado = false;
                break;
            }
        }

        return detectado;
    }

}
