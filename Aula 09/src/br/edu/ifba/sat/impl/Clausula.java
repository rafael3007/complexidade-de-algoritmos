package br.edu.ifba.sat.impl;

import java.util.ArrayList;
import java.util.List;

public class Clausula {

    private List<Integer> literais;

    public Clausula(int... literais) {
        this.literais = new ArrayList<>();

        for (int literal : literais) {
            this.literais.add(literal);
        }
    }

    public List<Integer> getLiterais() {
        return literais;
    }

}
