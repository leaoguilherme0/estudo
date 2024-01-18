package br.com.alura.screenmatch.exercicios.aula5_final;

public class Endereco {
    String cep;
    String rua;
    String complemento;
    String bairro;
    String cidade;
    String uf;

    public Endereco() {
    }

    public Endereco(EnderecoRecord enderecoRecord) {
        this.cep = enderecoRecord.cep();
        this.rua = enderecoRecord.logradouro();
        this.complemento = enderecoRecord.complemento();
        this.bairro = enderecoRecord.bairro();
        this.cidade = enderecoRecord.localidade();
        this.uf = enderecoRecord.uf();
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "CEP='" + cep + '\'' +
                ", rua='" + rua + '\'' +
                ", complemento='" + complemento + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", uf='" + uf + '\'' +
                '}';
    }
}
