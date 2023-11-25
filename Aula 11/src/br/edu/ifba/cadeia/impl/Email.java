package br.edu.ifba.cadeia.impl;

import br.edu.ifba.cadeia.mensageiro.ServicoDeMensageria;
import br.edu.ifba.cadeia.modelo.Nobreak;

public class Email extends ServicoDeMensageria {

    public Email(ServicoDeMensageria proximo) {
        super(proximo);
    }

    @Override
    public void alertar(Nobreak nobreak, String destinatario) {
        if (nobreak.getBateria() <= 90) {
            System.out.println("enviando email para " + destinatario + ": nobreak com carga " + nobreak.getBateria());
        }
    }
    
}
