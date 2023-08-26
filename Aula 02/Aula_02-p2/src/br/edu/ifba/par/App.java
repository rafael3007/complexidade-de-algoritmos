package br.edu.ifba.par;

public class App {

    /**
     * Recebe um numero inteiro como parametro e retorna verdadeiro para números Par
     * e false para números impares
     * 
     * @param number
     * @return
     */
    public static boolean isPar(int number) {
        return (number % 2 == 0);
    }

    public static void main(String[] args) throws Exception {
        int[] numeros = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 11, 20, 1000 };

        for (int i = 0; i < numeros.length; i++) {
            if (isPar(numeros[i])) {
                System.out.println("o numero " + numeros[i] + " é par!");
            } else {
                System.out.println("o numero " + numeros[i] + " é impar!");
            }
        }

    }
}
