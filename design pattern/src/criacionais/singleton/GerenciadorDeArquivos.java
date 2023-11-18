package criacionais.singleton;

import java.io.File;
import java.io.IOException;

import criacionais.singleton.modelo.NaoImplementado;
import criacionais.singleton.modelo.TipoDeArquivo;

public class GerenciadorDeArquivos {
    
    private static GerenciadorDeArquivos instancia = null;
    public static GerenciadorDeArquivos getInstancia() {
        if (instancia == null) {
            instancia = new GerenciadorDeArquivos();
        }

        return instancia;
    }

    private GerenciadorDeArquivos() {
    }

    public String criar(String nomeDoArquivo, TipoDeArquivo tipo) throws NaoImplementado, IOException {
        String novoArquivo = "";

        if (tipo == TipoDeArquivo.DOC) {
            novoArquivo = criar(nomeDoArquivo, "doc");
        } else if (tipo == TipoDeArquivo.PDF) {
            novoArquivo = criar(nomeDoArquivo, "pdf");
        } else {
            throw new NaoImplementado();
        }

        return novoArquivo;
    }

    private String criar(String nomeDoArquivo, String extensao) throws IOException {
        if (!nomeDoArquivo.endsWith("." + extensao)) {
            nomeDoArquivo += "." + extensao;
        }

        File arquivo = new File(nomeDoArquivo);
        arquivo.createNewFile();

        return nomeDoArquivo;
    }

    @Override
    public String toString() {
        return "gerenciador de arquivos";
    }

}
