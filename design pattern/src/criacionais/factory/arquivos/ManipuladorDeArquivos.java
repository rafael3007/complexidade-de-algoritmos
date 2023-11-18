package criacionais.factory.arquivos;

import java.io.File;
import java.io.IOException;

public abstract class ManipuladorDeArquivos {
    
    protected String criar(String nomeDoArquivo, String extensao) throws IOException {
        if (!nomeDoArquivo.endsWith("." + extensao)) {
            nomeDoArquivo += "." + extensao;
        }

        File arquivo = new File(nomeDoArquivo);
        arquivo.createNewFile();

        return nomeDoArquivo;
    }

    public abstract String criar(String nomeDoArquivo) throws IOException;

}
