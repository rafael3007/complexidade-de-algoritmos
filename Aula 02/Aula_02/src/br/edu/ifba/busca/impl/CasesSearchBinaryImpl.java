package br.edu.ifba.busca.impl;

import br.edu.ifba.busca.cases.Cases;

public class CasesSearchBinaryImpl extends Cases {

    public FindResult buscar() {

        FindResult result = new FindResult();
        int end = vetor.length - 1;

        if (numero < vetor[end]) {
            int begin = 0;
            int middle;// = vetor.length / 2;

            while (begin <= end) {
                result.incrementarPassos();

                middle = (begin + end) / 2;

                if (numero > vetor[middle]) {
                    begin = middle + 1;
                } else {
                    if (numero < vetor[middle]) {
                        end = middle - 1;
                    } else {
                        result.setFind(true);
                        break;
                    }
                }
            }
        }

        return result;
    }

    @Override
    public boolean detectarMelhorCaso() {
        boolean detected = false;

        FindResult resultado = new FindResult();
        if (resultado.isFind() && resultado.getPassosExecutados() <= 4) {
            detected = true;
        }

        return detected;
    }

    @Override
    public boolean detectarCasoMedio() {

        return buscar().isFind() ? true : false;
    }

    @Override
    public boolean detectarPiorCaso() {

        return !buscar().isFind() ? true : false;
    }

}
