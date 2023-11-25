package br.edu.ifba.cadeia.impl;

import br.edu.ifba.cadeia.mensageiro.ServicoDeMensageria;
import br.edu.ifba.cadeia.modelo.Nobreak;

public class Sms extends ServicoDeMensageria {

    public Sms(ServicoDeMensageria proximo) {
        super(proximo);
    }

    @Override
    public void alertar(Nobreak nobreak, String destinatario) {
        if (nobreak.getBateria() <= 50) {
            System.out.println("enviando SMS para " + destinatario + ": nobreak com carga " + nobreak.getBateria());
        }        

        if (temProximo()) {
            getProximo().alertar(nobreak, destinatario);
        }
    }
    
}
