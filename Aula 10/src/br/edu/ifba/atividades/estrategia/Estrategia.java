package br.edu.ifba.atividades.estrategia;

import java.util.List;

public interface Estrategia<Atividade> {

    public List<Atividade> selecionarAtividades(List<Atividade> atividades);

}
