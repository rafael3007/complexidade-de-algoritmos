package criacionais.factory.arquivos;

import java.io.IOException;

public class FabricaDeDocs implements FabricaDeArquivos {

    @Override
    public String criar(String nomeDoArquivo) throws IOException {
        return new ManipuladorDeDocs().criar(nomeDoArquivo);
    }
    
}
