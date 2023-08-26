public class App {

    /**
     * Recebe como parametro um array de inteiros , soma-0s e retorna o resultado do
     * tipo inteiro
     * 
     * @param numeros array de inteiros
     * @return int
     */
    public static int somar(int[] numeros) {
        int resultado = 0;

        for (int numero : numeros) {
            resultado += numero;
        }

        return resultado;
    }

    public static void main(String[] args) throws Exception {
        int[] numeros = new int[] { 1, 2, 3, 4, 5 };
        int soma = somar(numeros);

        System.out.println("O resultado é: " + soma);

    }
}
