package br.edu.ifba.cadeia;

import br.edu.ifba.cadeia.impl.Bateria;
import br.edu.ifba.cadeia.impl.Desligamento;
import br.edu.ifba.cadeia.impl.Mensageiro;
import br.edu.ifba.cadeia.modelo.Nobreak;

public class App {
    public static void main(String[] args) throws Exception {
        Nobreak nobreak = new Nobreak(100.0);

        Bateria bateria = new Bateria(nobreak);
        bateria.adicionarObservador(new Mensageiro());
        bateria.adicionarObservador(new Desligamento());

        bateria.atualizarConsumo(10);
        bateria.atualizarConsumo(15);
        bateria.atualizarConsumo(20);
        bateria.atualizarConsumo(30);
        bateria.atualizarConsumo(20);
    }
}
