package br.edu.ifba.busca.arvore;

public class No<TipoNo> {

    private TipoNo chave;
    private No<TipoNo> esquerda, direita;

    public No(TipoNo chave) {
        this.chave = chave;
        esquerda = direita = null;
    }

    public TipoNo getChave() {
        return chave;
    }

    public void setChave(TipoNo chave) {
        this.chave = chave;
    }

    public No<TipoNo> getDireita() {
        return direita;
    }

    public void setDireita(No<TipoNo> direita) {
        this.direita = direita;
    }

    public No<TipoNo> getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(No<TipoNo> esquerda) {
        this.esquerda = esquerda;
    }

}
