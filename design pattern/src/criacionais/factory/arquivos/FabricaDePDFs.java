package criacionais.factory.arquivos;

import java.io.IOException;

public class FabricaDePDFs implements FabricaDeArquivos {

    @Override
    public String criar(String nomeDoArquivo) throws IOException {
        return new ManipuladorDePDFs().criar(nomeDoArquivo);
    }
    
}
