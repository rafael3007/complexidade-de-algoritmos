package br.edu.ifba.busca;

// importações
import br.edu.ifba.busca.cases.Cases;
import br.edu.ifba.busca.generators.Numbers;
import br.edu.ifba.busca.impl.CasesSearchBinaryImpl;
import br.edu.ifba.busca.impl.NumberImpl;

public class App {
    private static final int NUMEROS_NO_VETOR = 99;
    private static final int NUMERO_DE_PROCURADO = 27;

    public static int[] gerarNumeros() {
        Numbers numeros = new NumberImpl();
        int[] vetor = numeros.gerarVetor(NUMEROS_NO_VETOR);
        numeros.ordenarVetor(vetor);

        return vetor;
    }

    public static Cases criarAnalisadorDeCasos() {
        return new CasesSearchBinaryImpl();

    }

    public static void main(String[] args) throws Exception {
        Cases casos = criarAnalisadorDeCasos();

        casos.setVetor(gerarNumeros());
        int[] vetorGerado = casos.getVetor();

        for (int i = 0; i < vetorGerado.length; i++) {
            System.out.println(vetorGerado[i]);
        }

        casos.setNumero(NUMERO_DE_PROCURADO);

        if (casos.detectarMelhorCaso()) {
            System.out.println("Melhor caso detectado: Número encontrado nas primeiras posições!");

        } else {
            if (casos.detectarCasoMedio()) {
                System.out.println("Caso medio detectado: Número encontrado!");
            } else {
                if (casos.detectarPiorCaso()) {
                    System.out.println("Pior caso detectado: Número não encontrado!");
                }
            }
        }

    }
}
