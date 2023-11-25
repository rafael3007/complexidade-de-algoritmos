package br.edu.ifba.observer.observavel;

import br.edu.ifba.observer.observador.Observador;

public interface Observavel {

    public void adicionarObservador(Observador observador);

    public void removerObservador(Observador observador);

    public void notificar();

}
