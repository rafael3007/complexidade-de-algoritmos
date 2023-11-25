package br.edu.ifba.adapter;


import br.edu.ifba.adapter.adaptador.AdaptadorHiperTexto;
import br.edu.ifba.adapter.impl.AdaptadorHiperTextoImpl;
import br.edu.ifba.adapter.modelo.HiperTexto;
import br.edu.ifba.adapter.modelo.Texto;

public class App {
    public static void main(String[] args) throws Exception {
        Texto texto = new Texto("Eu tenho que aprender padrões de projeto de softwawre");

        AdaptadorHiperTexto adaptador = new AdaptadorHiperTextoImpl(texto);

        HiperTexto italico = adaptador.italico();
        System.out.println(italico);

        HiperTexto negrito = adaptador.negrito();
        System.out.println(negrito);

        HiperTexto cancelado = adaptador.cancelado();
        System.out.println(cancelado);





    
    }
}
