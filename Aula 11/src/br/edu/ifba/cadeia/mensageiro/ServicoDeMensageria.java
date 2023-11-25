package br.edu.ifba.cadeia.mensageiro;

import br.edu.ifba.cadeia.modelo.Nobreak;

public abstract class ServicoDeMensageria {
    private ServicoDeMensageria proximo;

    public ServicoDeMensageria(ServicoDeMensageria proximo) {
        this.proximo = proximo;
    }

    public ServicoDeMensageria getProximo() {
        return proximo;
    }

    public void setProximo(ServicoDeMensageria proximo) {
        this.proximo = proximo;
    }

    public boolean temProximo() {
        return proximo != null;
    }

    public abstract void alertar(Nobreak nobreak, String destinatario);
}
