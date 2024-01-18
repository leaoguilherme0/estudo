package br.com.alura.screenmatch.exercicios.aula5_final;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static br.com.alura.screenmatch.exercicios.aula5_final.Utils.lerLinha;

public class BuscaCep {
    public static void digitaCep() throws IOException {
        List<Endereco> enderecos = new ArrayList<>();
        String busca = "";
        while(!busca.equalsIgnoreCase("s")) {

            String cep = lerLinha("Digite o CEP que deseja pesquisar");
            enderecos.add(GerarUrl.gerarUrl(cep));
            busca = lerLinha("Digite 'S' para SAIR ou qualquer tecla para continuar pesquisando");

        }
        GerarArquivoCep.gerarArquivoCep(enderecos);
    }
}
