package br.edu.ifba.sat;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.sat.impl.Clausula;
import br.edu.ifba.sat.impl.ResolucaoImpl;

public class App {
    public static void main(String[] args) throws Exception {
        List<Clausula> clausulas = new ArrayList<>();
        clausulas.add(new Clausula(1, 2)); // a OR b
        clausulas.add(new Clausula(-1, 3)); // NOT a OR c
        clausulas.add(new Clausula(-2, -3)); // NOT b OR NOT c
        clausulas.add(new Clausula(1, 3)); // a OR c
        clausulas.add(new Clausula(-2, 3)); // NOT b OR c
        clausulas.add(new Clausula(-1, 4)); // NOT a OR d
        clausulas.add(new Clausula(2, -3, -4)); // b OR NOT c OR NOT d

        ResolucaoImpl resolucao = new ResolucaoImpl();
        boolean resultado = resolucao.resolver(clausulas);

        if (resultado) {
            System.out.println("cláusulas resolvidas");
        } else {
            System.out.println("cláusulas não resolvidas");
        }

    }
}
