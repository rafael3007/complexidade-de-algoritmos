package br.edu.ifba.observer.impl;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.observer.modelo.Nobreak;
import br.edu.ifba.observer.observador.Observador;
import br.edu.ifba.observer.observavel.Observavel;

public class Bateria implements Observavel {

    private List<Observador> observadores = new ArrayList<>();
    private Nobreak nobreak;
    

    public Bateria(Nobreak nobreak) {
        this.nobreak = nobreak;
    }

    @Override
    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    @Override
    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }

    public void atualizarConsumo(double consumo){
        this.nobreak.consumirBateria(consumo);

        this.notificar();
    }

    @Override
    public void notificar() {
        for (Observador observador : observadores) {
            observador.atualizar(nobreak);
        }
    }
    
}
