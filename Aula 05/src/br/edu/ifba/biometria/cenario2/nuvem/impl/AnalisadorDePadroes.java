package br.edu.ifba.biometria.cenario2.nuvem.impl;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.biometria.cenario1.models.Biometria;
import br.edu.ifba.biometria.cenario1.nuvem.atuador.Atuador;

public class AnalisadorDePadroes implements Atuador<Biometria, Integer> {

    private List<Biometria> padrao = new ArrayList<>();

    public AnalisadorDePadroes(List<Biometria> padrao) {
        this.padrao = padrao;
    }

    // comeplxidae O(N^2) quadratica
    @Override
    public Integer atuar(List<Biometria> leituras) {
        int totalDeIguais = 0, totalDePadroes = 0;

        // complexidade on
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
