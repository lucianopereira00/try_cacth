package senhasusers;

public class ValidarSenha {

    public static void validarSenha(String senha) {
        if (senha.length() < 8) {
            throw new NumeroMinimoDeCaracteres("Senha deve ter no minimo 8 caracteres");
        }
    }
}
