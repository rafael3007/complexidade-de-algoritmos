package br.edu.ifba.busca.generators;

public interface Numbers {
    /**
     * Generate N items in the Array
     * 
     * @param quantidade
     * @return
     */
    int[] gerarVetor(int quantidade);

    int[] ordenarVetor(int[] numeros);
}
