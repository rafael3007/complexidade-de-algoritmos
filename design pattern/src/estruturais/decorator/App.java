package estruturais.decorator;

import estruturais.decorator.formatacao.Cancelado;
import estruturais.decorator.formatacao.Italico;
import estruturais.decorator.formatacao.Negrito;
import estruturais.decorator.modelo.HiperTexto;
import estruturais.decorator.modelo.Html;

public class App {
    public static void main(String[] args) throws Exception {
        HiperTexto texto = new Html("eu tenho que aprender padrões de projeto");
        System.out.println(texto.formatar());

        texto = new Negrito(texto);
        System.out.println(texto.formatar());

        texto = new Italico(texto);
        System.out.println(texto.formatar());

        texto = new Cancelado(texto);
        System.out.println(texto.formatar());
    }
}
