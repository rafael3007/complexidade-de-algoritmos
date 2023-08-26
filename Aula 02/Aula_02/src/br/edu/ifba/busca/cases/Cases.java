package br.edu.ifba.busca.cases;

public abstract class Cases {

    protected int[] vetor = null;
    protected int numero;

    // Getters and Setters

    public int[] getVetor() {
        return vetor;
    }

    public void setVetor(int[] vetor) {
        this.vetor = vetor;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * In the best case, the chosen number will be in the vector and will be in the
     * initial positions of the Array
     * 
     * @return
     */
    public abstract boolean detectarMelhorCaso();

    /**
     * In the middle case, the chosen number will be in the vector but an anywhere
     * position
     * 
     * @return
     */
    public abstract boolean detectarCasoMedio();

    /**
     * In the loss case, the chosen number won't be in the vector
     * 
     * @return
     */
    public abstract boolean detectarPiorCaso();

}
