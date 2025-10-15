package classes;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

public class ConsultarMoeda {

    public Moeda buscarMoeada(String nome) {

        URI moeda = URI.create("https://v6.exchangerate-api.com/v6/d60149fd28191017c723cad7/latest/" + nome);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(moeda).build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moeda.class);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar a moeda escolhida!");
        }

    }

}
