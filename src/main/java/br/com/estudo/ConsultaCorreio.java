package br.com.alura.screenmatch.exercicios.aula5_final;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaCorreio {
    public static Endereco consultaCorreio(String url) {

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return ConverterEndereco.converterEndereco(response.body());
        }catch (IOException | InterruptedException e){
            throw new RuntimeException("Erro ao consultar o CEP");
        }
    }
}
