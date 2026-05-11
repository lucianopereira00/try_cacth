package buscarusuarios;

public class ErroNaBuscaPeloUsuario extends RuntimeException {

    private String mensagem;

    public ErroNaBuscaPeloUsuario(String mensagem) {
       this.mensagem =  mensagem;
    }
    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
