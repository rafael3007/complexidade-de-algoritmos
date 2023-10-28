package br.edu.ifba.sat.resolucao;

import java.util.List;

public interface Resolucao<Clausula> {
    public boolean resolver(List<Clausula> clausulas);
}
