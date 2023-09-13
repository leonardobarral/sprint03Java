package org.example.models;

public class Imagem extends DadosComuns{
    private String endereco;
    private String tamanho;
    private String extencao;

    public Imagem(long id, String user, String dataCadastro, String dataFim, String endereco, String tamanho, String extencao) {
        super(id, user, dataCadastro, dataFim);
        this.endereco = endereco;
        this.tamanho = tamanho;
        this.extencao = extencao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getExtencao() {
        return extencao;
    }

    public void setExtencao(String extencao) {
        this.extencao = extencao;
    }
}
