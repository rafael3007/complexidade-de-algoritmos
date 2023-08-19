package br.edu.ifba.busca;

// importações
import br.edu.ifba.busca.cases.Cases;
import br.edu.ifba.busca.generators.Numbers;
import br.edu.ifba.busca.impl.CasesImpl;
import br.edu.ifba.busca.impl.NumberImpl;

public class App {
    private static final int NUMEROS_NO_VETOR = 1000;
    private static final int NUMERO_DE_PROCURADO = 27;

    public static Numbers criarGeradorDeNumeros() {
        return new NumberImpl();
    }

    public static Cases criarAnalisadorDeCasos() {
        return new CasesImpl();

    }

    public static void main(String[] args) throws Exception {
        Numbers numeros = criarGeradorDeNumeros();
        Cases casos = criarAnalisadorDeCasos();

        casos.setVetor(numeros.gerarVetor(NUMEROS_NO_VETOR));
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
