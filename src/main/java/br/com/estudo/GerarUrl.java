package br.com.alura.screenmatch.exercicios.aula5_final;

public class GerarUrl {
    public static Endereco gerarUrl(String cep){
        String url = "https://viacep.com.br/ws/" + cep.replace("-", "").replace(" ", "") + "/json/";
        return ConsultaCorreio.consultaCorreio(url);
    }
}
