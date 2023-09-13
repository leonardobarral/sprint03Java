package org.example.models;

import java.util.ArrayList;
import java.util.List;

public class VeiculoApolice extends DadosComuns{
    private List<ImagemOriginalVeiculo> imagensOriginalVeiculo = new ArrayList<>();

    public VeiculoApolice(long id, String user, String dataCadastro, String dataFim, List<ImagemOriginalVeiculo> imagensOriginalVeiculo) {
        super(id, user, dataCadastro, dataFim);
        this.imagensOriginalVeiculo = imagensOriginalVeiculo;
    }

    public List<ImagemOriginalVeiculo> getImagensOriginalVeiculo() {
        return imagensOriginalVeiculo;
    }

    public void setImagensOriginalVeiculo(List<ImagemOriginalVeiculo> imagensOriginalVeiculo) {
        this.imagensOriginalVeiculo = imagensOriginalVeiculo;
    }
}
