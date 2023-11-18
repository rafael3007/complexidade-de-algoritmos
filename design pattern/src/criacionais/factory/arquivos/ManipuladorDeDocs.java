package criacionais.factory.arquivos;

import java.io.IOException;

public class ManipuladorDeDocs extends ManipuladorDeArquivos {

    @Override
    public String criar(String nomeDoArquivo) throws IOException {
        return criar(nomeDoArquivo, "doc");
    }
    
}
