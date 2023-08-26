package br.edu.ifba.busca.arvore;

public abstract class Arvore<TipoNo> {

    private No<TipoNo> raiz;

    public Arvore() {
        this.raiz = null;
    }

    public void inserir(TipoNo chave) {
        raiz = inserir(raiz, chave);
    }

    public No<TipoNo> buscar(TipoNo chave) {
        return buscar(raiz, chave);
    }

    public abstract No<TipoNo> inserir(No<TipoNo> raiz, TipoNo chave);

    public abstract No<TipoNo> buscar(No<TipoNo> raiz, TipoNo chave);
}
