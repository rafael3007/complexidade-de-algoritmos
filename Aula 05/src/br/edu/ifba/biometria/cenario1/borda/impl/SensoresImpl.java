package br.edu.ifba.biometria.cenario1.borda.impl;

import java.util.Random;

import br.edu.ifba.biometria.cenario1.borda.Sensores;
import br.edu.ifba.biometria.cenario1.models.Biometria;

public class SensoresImpl implements Sensores<Biometria> {

    private static final int BATIMENTOS_NORMAIS = 80;
    private static final int TEMPERATURA_NORMAL = 36;

    private static final int OSCILACAO_MAXIMA_BATIMENTOS = 30;
    private static final int OSCILACAO_MAXIMA_TEMPERATURA = 30;

    private Biometria ultimaLeitura = new Biometria(BATIMENTOS_NORMAIS, TEMPERATURA_NORMAL);

    // ode 1
    @Override
    public boolean temLeitura() {
        Random randomizador = new Random();

        int oscilacao = randomizador.nextInt(OSCILACAO_MAXIMA_BATIMENTOS);
        boolean somar = randomizador.nextBoolean();
        int batimentos = (int) (somar ? BATIMENTOS_NORMAIS + (BATIMENTOS_NORMAIS * oscilacao / 100)
                : BATIMENTOS_NORMAIS - (BATIMENTOS_NORMAIS * oscilacao / 100));

        oscilacao = randomizador.nextInt(OSCILACAO_MAXIMA_TEMPERATURA);
        somar = randomizador.nextBoolean();
        int temperatura = (int) (somar ? TEMPERATURA_NORMAL + (TEMPERATURA_NORMAL * oscilacao / 100)
                : TEMPERATURA_NORMAL - (TEMPERATURA_NORMAL * oscilacao / 100));

        ultimaLeitura = new Biometria(batimentos, temperatura);

        return true;
    }

    @Override
    public Biometria getLeitura() {
        return ultimaLeitura;
    }

}
