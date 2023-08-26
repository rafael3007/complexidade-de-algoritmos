package br.edu.ifba.busca.impl;

public class FindResult {
    private boolean find = false;
    private int passosExecutados = 0;

    public boolean isFind() {
        return find;
    }

    public void setFind(boolean find) {
        this.find = find;
    }

    public int getPassosExecutados() {
        return passosExecutados;
    }

    public void setPassosExecutados(int passosExecutados) {
        this.passosExecutados = passosExecutados;
    }

    public void incrementarPassos() {
        this.passosExecutados++;
    }

}
