package br.edu.ifba.atividades.impl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.edu.ifba.atividades.estrategia.Estrategia;

public class EstrategiaImpl implements Estrategia<Atividade> {

    @Override
    public List<Atividade> selecionarAtividades(List<Atividade> atividades) {
        List<Atividade> atividadesSelecionadas = new ArrayList<>();
        
        atividades.sort(Comparator.comparingInt(atividade -> atividade.getFim()));

        Atividade atividadeAnterior = null;
        for (Atividade atividade: atividades) {
            if (atividadeAnterior == null || atividade.getInicio() >= atividadeAnterior.getFim()) {
                atividadesSelecionadas.add(atividade);
                atividadeAnterior = atividade;
            }
        }

        return atividadesSelecionadas;
    }
    
}
