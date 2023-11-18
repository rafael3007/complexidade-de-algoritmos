package criacionais.singleton;

import criacionais.singleton.modelo.TipoDeArquivo;

public class App {
    private static final String CAMINHO_ARQUIVOS = "/misc/ifba/workspaces/complexidade/14/criacionais/singleton/repositorio/";

    public static void main(String[] args) throws Exception {
        System.out.println(
            "arquivo criado: " +
            GerenciadorDeArquivos.getInstancia().criar(CAMINHO_ARQUIVOS + "documento", TipoDeArquivo.PDF));
        System.out.println(
            "arquivo criado: " +
            GerenciadorDeArquivos.getInstancia().criar(CAMINHO_ARQUIVOS + "documento", TipoDeArquivo.DOC));
    }
}
