package criacionais.factory.arquivos;

import java.io.IOException;

import criacionais.factory.modelo.NaoImplementado;
import criacionais.factory.modelo.TipoDeArquivo;

public class Fabrica {

    public String criarArquivo(String nomeDoArquivo, TipoDeArquivo tipo) throws NaoImplementado, IOException {
        FabricaDeArquivos fabrica = null;

        if (tipo == TipoDeArquivo.PDF) {
            fabrica = new FabricaDePDFs();
        } else if (tipo == TipoDeArquivo.DOC) {
            fabrica = new FabricaDeDocs();
        } else {
            throw new NaoImplementado();
        }

        return fabrica.criar(nomeDoArquivo);
    }
    
}
