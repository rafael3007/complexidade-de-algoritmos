package br.edu.ifba.observer;

import br.edu.ifba.observer.impl.Bateria;
import br.edu.ifba.observer.impl.Desligamento;
import br.edu.ifba.observer.impl.Mensageiro;
import br.edu.ifba.observer.modelo.Nobreak;

public class App {
    public static void main(String[] args) {
        Nobreak nobreak = new Nobreak(100.0);

        Bateria bateria = new Bateria(nobreak);
        
        bateria.adicionarObservador(new Mensageiro());
        bateria.adicionarObservador(new Desligamento());

        for(double consumo = 5; nobreak.getBateria() > 0; consumo = consumo - consumo + consumo){
            System.out.println("consumo: "+consumo);
            bateria.atualizarConsumo(consumo);
        }

        // bateria.atualizarConsumo(10); // faz nada 

        // bateria.atualizarConsumo(15); // notificação nivel 1


        // bateria.atualizarConsumo(20); // notificação nivel 2
        // bateria.atualizarConsumo(30); // notificação nivel 3
        // bateria.atualizarConsumo(20); // Desligamento das maquinas

    }
}
