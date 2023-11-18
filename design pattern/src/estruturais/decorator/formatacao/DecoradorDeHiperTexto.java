package estruturais.decorator.formatacao;

import estruturais.decorator.modelo.HiperTexto;

public abstract class DecoradorDeHiperTexto implements HiperTexto {
    protected HiperTexto texto;

    public DecoradorDeHiperTexto(HiperTexto texto) {
        this.texto = texto;
    }

    @Override
    public String formatar() {
        return this.texto.formatar();
    }
}
