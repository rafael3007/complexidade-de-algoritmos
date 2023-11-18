package br.edu.ifba.atividades;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.atividades.impl.Atividade;
import br.edu.ifba.atividades.impl.EstrategiaImpl;

public class App {
    public static void main(String[] args) throws Exception {
        List<Atividade> atividades = new ArrayList<>();

        atividades.add(new Atividade(1, 4));
        atividades.add(new Atividade(3, 5));
        atividades.add(new Atividade(0, 6));
        atividades.add(new Atividade(5, 7));
        atividades.add(new Atividade(3, 9));
        atividades.add(new Atividade(6, 10));
        atividades.add(new Atividade(8, 11));
        atividades.add(new Atividade(2, 14));

        List<Atividade> selecionadas = new EstrategiaImpl().selecionarAtividades(atividades);
        System.out.println("ativides selecionadas:");
        for (Atividade atividade: selecionadas) {
            System.out.println(atividade);
        }
    }
}
