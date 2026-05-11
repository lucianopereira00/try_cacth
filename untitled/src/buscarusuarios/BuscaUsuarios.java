package buscarusuarios;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class BuscaUsuarios {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do usuario: ");
        String nomeUsuario = scanner.nextLine();

        String nome = nomeUsuario.replace(" ", "");
        String url = "https://api.github.com/users/" +  nome;
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder(URI.create(url)).build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                System.out.println("O usuário foi encontrado com sucesso!");
                System.out.println(response.body());
            } else if (response.statusCode() == 404) {
                throw new ErroNaBuscaPeloUsuario("O usuário '" + nome + "' não foi encontrado no GitHub!");
            } else {
                System.out.println("Erro inesperado: Status " + response.statusCode());
            }
            String json = response.body();
            System.out.println(json);


        }catch (IOException | InterruptedException e){
            System.out.println("Erro ao tentar buscar usuario");
            e.printStackTrace();
        }catch (ErroNaBuscaPeloUsuario e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
