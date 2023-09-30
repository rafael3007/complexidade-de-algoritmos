package br.edu.ifba.biometria.cenario2.borda.impl;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.biometria.cenario2.borda.atuador.Atuador;
import br.edu.ifba.biometria.cenario2.models.Biometria;

public class AnalisadorDePadroes implements Atuador<Biometria, Integer> {

    private List<Biometria> padrao = new ArrayList<>();

    public AnalisadorDePadroes(List<Biometria> padrao) {
        this.padrao = padrao;
    }

    // quadratica, O(N^2)
    @Override
    public Integer atuar(List<Biometria> leituras) {
        int totalDeIguais = 0, totalDePadroes = 0;

        for (int i = 0; i < leituras.size() - padrao.size(); i++) {
            for (int j = 0; j < padrao.size(); j++) {
                if (leituras.get(i + j).equals(padrao.get(j))) {
                    totalDeIguais++;

                    if (totalDeIguais == padrao.size()) {
                        totalDePadroes++;
                    } else {
                        totalDeIguais = 0;

                        break;
                    }
                }
            }
        }

        return totalDePadroes;
    }

}
