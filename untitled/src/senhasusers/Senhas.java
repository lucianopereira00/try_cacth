package senhasusers;

import java.util.Scanner;

import static senhasusers.ValidarSenha.validarSenha;

public class Senhas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);System.out.print("Digite sua senha: ");
        String senha = input.nextLine();
        try {
            validarSenha(senha);
            System.out.println("Senha válida!");
        }catch (NumeroMinimoDeCaracteres e){
            System.out.println("ERRO\n"+e.getMessage());
        }
    }
}
