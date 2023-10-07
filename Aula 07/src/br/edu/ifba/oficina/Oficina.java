package br.edu.ifba.oficina;

public class Oficina {

    public double calcularTrocaDeOleo(boolean trocarOleo, double preco) {
        if (trocarOleo) {
            preco += 60;
        }

        return preco;
    }

    public double calcularAlinhamento(boolean trocarOleo, boolean alinhamento, double preco) {
        if (trocarOleo) {
            if (alinhamento) {
                System.out.println("alinhamento grátis para quem faz troca de óleo");
            }
        } else {
            if (alinhamento) {
                preco += 40;
            }
        }

        return preco;
    }

    public double calcularLimpezaAr(boolean trocarOleo, boolean limpezaAr, double preco) {
        if (trocarOleo) {
            if (limpezaAr) {
                System.out.println("limpeza grátis para quem faz troca de óleo");
            }
        } else {
            if (limpezaAr) {
                preco += 30;
            }
        }
        if (limpezaAr) {
            System.out.println("ofereça a troca de filtro de ar por $40");
        }

        return preco;
    }

    public double calcularAdicionais(String[] adicionais, double preco) {
        if (adicionais.length > 0) {
            for (String adicional : adicionais) {
                preco += 20;

                System.out.println("preço com adicional " + adicional + " = " + preco);
            }
        }

        return preco;
    }

    public double calcularDesconto(double desconto, double preco) {
        if (desconto > 0) {
            preco -= desconto;
        }

        return preco;
    }

    public double calcularPrecoServicos(ParametrosDeCalculo parametros) {
        double preco = 0;

        preco = calcularTrocaDeOleo(parametros.isTrocarOleo(), preco);
        preco = calcularAlinhamento(parametros.isTrocarOleo(), parametros.isAlinhamento(), preco);
        preco = calcularLimpezaAr(parametros.isTrocarOleo(), parametros.isLimpezaAr(), preco);
        preco = calcularAdicionais(parametros.getAdicionais(), preco);
        preco = calcularDesconto(parametros.getDesconto(), preco);

        return preco;
    }

}
