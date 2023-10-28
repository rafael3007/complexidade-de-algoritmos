package br.edu.ifba.sat.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.edu.ifba.sat.resolucao.Resolucao;

public class ResolucaoImpl implements Resolucao<Clausula> {

    @Override
    public boolean resolver(List<Clausula> clausulas) {
        Map<Integer, Boolean> atribuicoes = new HashMap<>();

        return dpll(clausulas, atribuicoes);
    }

    private boolean dpll(List<Clausula> clausulas, Map<Integer, Boolean> atribuicoes) {
        boolean todasClausulasSatisfeitas = true;

        for (Clausula clausula : clausulas) {
            boolean clausulaSatisfeita = true;
            for (Integer literal : clausula.getLiterais()) {
                if (atribuicoes.containsKey(literal) && atribuicoes.get(literal)) {
                    clausulaSatisfeita = true;

                    break;
                } else if (atribuicoes.containsKey(-literal) && !atribuicoes.get(-literal)) {
                    clausulaSatisfeita = true;

                    break;
                }
            }
            if (!clausulaSatisfeita) {
                todasClausulasSatisfeitas = false;

                break;
            }
        }
        if (todasClausulasSatisfeitas) {
            return true;
        }

        for (Clausula clausula : clausulas) {
            boolean clausulaFalsa = true;
            for (Integer literal : clausula.getLiterais()) {
                if (!atribuicoes.containsKey(literal) || atribuicoes.get(literal)) {
                    clausulaFalsa = false;

                    break;
                }
            }
            if (clausulaFalsa) {
                return false;
            }
        }

        int literal = 0;
        for (Clausula clausula : clausulas) {
            for (Integer l : clausula.getLiterais()) {
                if (!atribuicoes.containsKey(l)) {
                    literal = l;

                    break;
                }
            }
            if (literal != 0) {
                break;
            }
        }

        Map<Integer, Boolean> atribuicoesVerdadeiras = new HashMap<>(atribuicoes);
        atribuicoesVerdadeiras.put(literal, true);
        if (dpll(clausulas, atribuicoesVerdadeiras)) {
            return true;
        }

        Map<Integer, Boolean> atribuicoesFalsas = new HashMap<>(atribuicoes);
        atribuicoesFalsas.put(literal, false);
        if (dpll(clausulas, atribuicoesFalsas)) {
            return true;
        }

        return false;
    }

}
