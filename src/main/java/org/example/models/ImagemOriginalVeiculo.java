package org.example.models;

public class ImagemOriginalVeiculo extends Imagem{
    private long idVeiculoApolice;
    private String fonteImagem;//pode ser banoc de imagens padrões do tipo de veículo ou da vistoria

    public ImagemOriginalVeiculo(long id, String user, String dataCadastro, String dataFim, String endereco, String tamanho, String extencao, long idVeiculoApolice, String fonteImagem) {
        super(id, user, dataCadastro, dataFim, endereco, tamanho, extencao);
        this.idVeiculoApolice = idVeiculoApolice;
        this.fonteImagem = fonteImagem;
    }

    public long getIdVeiculoApolice() {
        return idVeiculoApolice;
    }

    public void setIdVeiculoApolice(long idVeiculoApolice) {
        this.idVeiculoApolice = idVeiculoApolice;
    }

    public String getFonteImagem() {
        return fonteImagem;
    }

    public void setFonteImagem(String fonteImagem) {
        this.fonteImagem = fonteImagem;
    }
}
