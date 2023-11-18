package criacionais.factory;

import criacionais.factory.arquivos.Fabrica;
import criacionais.factory.modelo.TipoDeArquivo;

public class App {
    private static final String CAMINHO_ARQUIVO = "/misc/ifba/workspaces/complexidade/14/criacionais/factory/repositorio/";

    public static void main(String[] args) throws Exception {
        String arquivo = new Fabrica().criarArquivo(CAMINHO_ARQUIVO + "documento", TipoDeArquivo.DOC);
        System.out.println("arquivo criado: " + arquivo);

        arquivo = new Fabrica().criarArquivo(CAMINHO_ARQUIVO + "documento", TipoDeArquivo.PDF);
        System.out.println("arquivo criado: " + arquivo);
    }
}
