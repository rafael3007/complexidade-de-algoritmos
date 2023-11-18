package estruturais.decorator.formatacao;

import estruturais.decorator.modelo.HiperTexto;

public class Cancelado extends DecoradorDeHiperTexto {

    public Cancelado(HiperTexto texto) {
        super(texto);
    }

    @Override
    public String formatar() {
        return "<del>" + super.formatar() + "</del>";
    }
    
}
