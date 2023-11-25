package br.edu.ifba.adapter.impl;

import br.edu.ifba.adapter.adaptador.AdaptadorHiperTexto;
import br.edu.ifba.adapter.modelo.HiperTexto;
import br.edu.ifba.adapter.modelo.Texto;

public class AdaptadorHiperTextoImpl extends HiperTexto implements AdaptadorHiperTexto {

    public AdaptadorHiperTextoImpl(Texto texto) {
        super(texto);
    }

    @Override
    public HiperTexto negrito() {
        return new HiperTexto(new Texto("<b>"+ texto.getConteudo() + "</b>"));
    }

    @Override
    public HiperTexto italico() {
       return new HiperTexto(new Texto("<i>"+ texto.getConteudo() + "</i>"));
    }

    @Override
    public HiperTexto cancelado() {
        return new HiperTexto(new Texto("<i>"+ texto.getConteudo() + "</i>"));
    }
    
}
