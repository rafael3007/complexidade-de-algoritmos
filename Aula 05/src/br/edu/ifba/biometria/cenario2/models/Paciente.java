package br.edu.ifba.biometria.cenario2.models;

import java.util.ArrayList;
import java.util.List;

// constante, O(1)
public class Paciente implements Comparable<Paciente> {

    private String id = "";
    private String nome = "";

    private List<Biometria> leituras = new ArrayList<>();
    private Biometria ultimaLeitura = null;

    public Paciente(String id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Biometria> getLeituras() {
        return leituras;
    }

    public void setLeituras(List<Biometria> leituras) {
        this.leituras = leituras;
    }

    public Biometria getUltimaLeitura() {
        return ultimaLeitura;
    }

    public void setUltimaLeitura(Biometria ultimaLeitura) {
        this.ultimaLeitura = ultimaLeitura;
    }

    public void onLeitura(Biometria leitura) {
        this.leituras.add(leitura);
        this.ultimaLeitura = leitura;
    }

    @Override
    public int compareTo(Paciente outroPaciente) {
        return id.compareTo(outroPaciente.getId());
    }

}
