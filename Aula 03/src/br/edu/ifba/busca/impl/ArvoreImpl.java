package br.edu.ifba.busca.impl;

import br.edu.ifba.busca.arvore.Arvore;
import br.edu.ifba.busca.arvore.No;

public class ArvoreImpl extends Arvore<Integer> {

    @Override
    public No<Integer> inserir(No<Integer> raiz, Integer chave) {
        if (raiz == null) {
            raiz = new No<Integer>(chave);

            return raiz;
        }

        if (chave < raiz.getChave()) {
            raiz.setEsquerda(inserir(raiz.getEsquerda(), chave));
        } else if (chave > raiz.getChave()) {
            raiz.setDireita(inserir(raiz.getDireita(), chave));
        }

        return raiz;
    }

    @Override
    public No<Integer> buscar(No<Integer> raiz, Integer chave) {
        if (raiz == null || raiz.getChave() == chave) {
            return raiz;
        }

        if (chave < raiz.getChave()) {
            return buscar(raiz.getEsquerda(), chave);
        }

        return buscar(raiz.getDireita(), chave);
    }

    /**
     * 
     * @Override
     *           public void imprimir() {
     *           StringBuilder strBuilder = new StringBuilder();
     *           imprimir(strBuilder, "", "", getRaiz());
     *           System.out.println(strBuilder.toString());
     *           }
     */

    public void imprimir(StringBuilder strBuilder, String padding, String pointer, No<Integer> no) {
        if (no != null) {
            strBuilder.append(padding);
            strBuilder.append(pointer);
            strBuilder.append(no.getChave());
            strBuilder.append("\n");

            StringBuilder paddingBuilder = new StringBuilder(padding);
            paddingBuilder.append("│  ");

            String paddingForBoth = paddingBuilder.toString();
            String pointerForRight = "└─D─";
            String pointerForLeft = (no.getDireita() != null) ? "├─E─" : "└──";

            imprimir(strBuilder, paddingForBoth, pointerForLeft, no.getEsquerda());
            imprimir(strBuilder, paddingForBoth, pointerForRight, no.getDireita());
        }
    }

}
