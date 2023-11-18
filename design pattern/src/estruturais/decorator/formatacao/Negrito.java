package estruturais.decorator.formatacao;

import estruturais.decorator.modelo.HiperTexto;

public class Negrito extends DecoradorDeHiperTexto {

    public Negrito(HiperTexto texto) {
        super(texto);
    } 

    @Override
    public String formatar() {
        return "<b>" + super.formatar() + "</b>";
    }
    
}

