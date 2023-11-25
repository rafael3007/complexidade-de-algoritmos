package br.edu.ifba.cadeia.impl;

import br.edu.ifba.cadeia.mensageiro.ServicoDeMensageria;
import br.edu.ifba.cadeia.modelo.Nobreak;

public class WhatsApp extends ServicoDeMensageria {

    public WhatsApp(ServicoDeMensageria proximo) {
        super(proximo);
    }

    @Override
    public void alertar(Nobreak nobreak, String destinatario) {
        if (nobreak.getBateria() <= 10) {
            System.out.println("enviando mensagem de Whatsapp para " + destinatario + ": nobreak com carga " + nobreak.getBateria());
        }

        if (temProximo()) {
            getProximo().alertar(nobreak, destinatario);
        }
    }
    
}
