package br.edu.ifba.adapter.modelo;

public class HiperTexto {
    protected Texto texto;

    public HiperTexto(Texto texto) {
        this.texto = texto;
    }

    @Override
    public String toString(){
        return texto.getConteudo();
    }
}
