package br.edu.ifba.conversor;

public class App {

    /**
     * Recebe uma medição em Fahrenheit do tipo double como parametro e utiliza a
     * formula comum para converter e dar o resultado da temperatura em Celsius
     * 
     * @param fahre type double
     * @return
     */
    public static double toCelsius(double fahrenheit) {

        return ((fahrenheit - 32) * 5 / 9);
    }

    public static void main(String[] args) throws Exception {
        double[] medicoes = new double[] { 54, 63, 72.6, 24.5, 65.6, 25.6, };

        for (double medicao : medicoes) {
            double celsius = toCelsius(medicao);

            System.out.println("Medição em Celcius de " + medicao + " é igual a: " + celsius);
        }
    }
}
