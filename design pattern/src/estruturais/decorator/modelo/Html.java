package estruturais.decorator.modelo;

public class Html implements HiperTexto {
    private String conteudo = "";

    public Html(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public String formatar() {
        return conteudo;
    }

}
