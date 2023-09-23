package br.edu.ifba.borda.impl;

import java.util.Random;

import br.edu.ifba.borda.Sensores;
import br.edu.ifba.models.Biometria;

public class SensoresImpl implements Sensores<Biometria> {

    private static final int BATIMENTOS_NORMAIS = 80;
    private static final int TEMPERATURA_NORMAL = 36;
    private static final int OSCILACAO_MAXIMA_DE_BATIMENTOS = 30;
    private static final int OSCILACAO_MAXIMA_DE_TEMPERATURA = 30;
    private Biometria ultimaLeitura = new Biometria(BATIMENTOS_NORMAIS, TEMPERATURA_NORMAL);

    @Override
    public boolean temLeitura() {
        Random randomizador = new Random();

        // simulando as leituras

        // oscilação das leituas
        int oscilacaoBatimentos = randomizador.nextInt(OSCILACAO_MAXIMA_DE_BATIMENTOS);

        boolean somar = randomizador.nextBoolean();

        int batimentos = somar ? BATIMENTOS_NORMAIS + (BATIMENTOS_NORMAIS * oscilacaoBatimentos / 100)
                : BATIMENTOS_NORMAIS - (BATIMENTOS_NORMAIS * oscilacaoBatimentos / 100);

        somar = randomizador.nextBoolean();

        int oscilacaoTemperatura = randomizador.nextInt(OSCILACAO_MAXIMA_DE_TEMPERATURA);

        int temperatura = somar ? TEMPERATURA_NORMAL + (TEMPERATURA_NORMAL * oscilacaoTemperatura / 100)
                : TEMPERATURA_NORMAL - (TEMPERATURA_NORMAL * oscilacaoTemperatura / 100);

        ultimaLeitura = new Biometria(batimentos, temperatura);

        return true;
    }

    @Override
    public Biometria getLeitura() {
        return ultimaLeitura;
    }

}
