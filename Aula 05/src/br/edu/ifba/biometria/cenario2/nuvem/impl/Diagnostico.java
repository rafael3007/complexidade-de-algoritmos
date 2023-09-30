package br.edu.ifba.biometria.cenario2.nuvem.impl;

import java.util.List;

import br.edu.ifba.biometria.cenario1.models.Biometria;
import br.edu.ifba.biometria.cenario1.nuvem.atuador.Atuador;

public class Diagnostico implements Atuador<Biometria, String> {

    private static final int LIMITE_ATE_TAQUICARDIA = 95;
    private static final int LIMITE_ATE_BRAQUICARDIA = 60;

    private static final int LIMITE_ATE_HIPERTERMIA = 38;
    private static final int LIMITE_ATE_HIPOTERMIA = 27;

    // O(n) complexidade linear
    @Override
    public String atuar(List<Biometria> leituras) {
        String diagnostico = "";

        double mediaBatimentos = .0, mediaTemperatura = .0;
        for (Biometria leitura : leituras) {
            mediaBatimentos += leitura.getBatimentos();
            mediaTemperatura += leitura.getTemperatura();
        }

        mediaBatimentos /= leituras.size();
        mediaTemperatura /= leituras.size();

        if (mediaBatimentos >= LIMITE_ATE_TAQUICARDIA) {
            diagnostico += "taquicardia ";
        } else if (mediaBatimentos <= LIMITE_ATE_BRAQUICARDIA) {
            diagnostico += "braquicardia ";
        }

        if (mediaTemperatura >= LIMITE_ATE_HIPERTERMIA) {
            diagnostico += "hipertermia (febre) ";
        } else if (mediaTemperatura <= LIMITE_ATE_HIPOTERMIA) {
            diagnostico += "hipotermia";
        }

        return diagnostico;
    }

}
