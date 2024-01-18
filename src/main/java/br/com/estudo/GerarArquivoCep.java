package br.com.alura.screenmatch.exercicios.aula5_final;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import static br.com.alura.screenmatch.exercicios.aula5_final.Utils.gson;

public class GerarArquivoCep {
    public static List<Endereco> gerarArquivoCep(List<Endereco> enderecos) throws IOException {
        FileWriter jsonCEP = new FileWriter("resultadoPesquisa.json");
        jsonCEP.write(gson.toJson(enderecos));
        jsonCEP.close();
        return enderecos;
    }
}
