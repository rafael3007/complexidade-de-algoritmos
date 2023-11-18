package criacionais.factory.arquivos;

import java.io.IOException;

public interface FabricaDeArquivos {
    
    public String criar(String nomeDoArquivo) throws IOException;    

}
