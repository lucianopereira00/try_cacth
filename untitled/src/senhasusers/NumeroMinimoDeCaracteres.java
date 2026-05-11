package senhasusers;

public class NumeroMinimoDeCaracteres extends RuntimeException {

    private String mensagem;

    public NumeroMinimoDeCaracteres(String mensagem) {
        this.mensagem = mensagem;
    }
    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
