package br.edu.ifba.oficina;

public class App {
    public static void main(String[] args) throws Exception {
        Oficina oficina = new Oficina();

        ParametrosDeCalculo parametros = new ParametrosDeCalculo(true, true, true);
        parametros.setAdicionais(new String[] { "verificação de embreagem", "revisão de freios" });
        parametros.setDesconto(10);

        double preco = oficina.calcularPrecoServicos(parametros);

        System.out.println("valor total dos serviços: " + preco);
    }
}
