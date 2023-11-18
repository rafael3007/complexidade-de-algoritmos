package estruturais.decorator.formatacao;

import estruturais.decorator.modelo.HiperTexto;

public class Italico extends DecoradorDeHiperTexto {

    public Italico(HiperTexto texto) {
        super(texto);
    }

    @Override
    public String formatar() {
        return "<i>" + super.formatar() + "</i>";
    }
    
}
