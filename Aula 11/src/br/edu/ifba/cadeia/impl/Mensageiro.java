package br.edu.ifba.cadeia.impl;

import br.edu.ifba.cadeia.mensageiro.ServicoDeMensageria;
import br.edu.ifba.cadeia.modelo.Nobreak;
import br.edu.ifba.cadeia.observador.Observador;

public class Mensageiro implements Observador {

    ServicoDeMensageria mensageria;

    public Mensageiro() {
        mensageria = new Email(null);
        mensageria = new Sms(mensageria);
        mensageria = new WhatsApp(mensageria);
        mensageria = new Telegram(mensageria);
    }

    @Override
    public void atualizar(Nobreak nobreak) {
        if (nobreak.getBateria() <= 10) {
            mensageria.alertar(nobreak, "todos");
        } else if (nobreak.getBateria() <= 50) {
            mensageria.alertar(nobreak, "supervisor");
        } else if (nobreak.getBateria() <= 80) {
            mensageria.alertar(nobreak, "responsável direto");
        }
    }
    
}
