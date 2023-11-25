package br.edu.ifba.cadeia.observavel;

import br.edu.ifba.cadeia.observador.Observador;

public interface Observavel {
    
    public void adicionarObservador(Observador observador);

    public void removerObservador(Observador observador);

    public void notificar();

}
