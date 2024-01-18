package br.com.alura.screenmatch.exercicios.aula5_final;

import static br.com.alura.screenmatch.exercicios.aula5_final.Utils.getGson;

public class ConverterEndereco {
    public static Endereco converterEndereco(String json){
        EnderecoRecord enderecoRecord = getGson().fromJson(json, EnderecoRecord.class);
        return new Endereco(enderecoRecord);
    }
}
