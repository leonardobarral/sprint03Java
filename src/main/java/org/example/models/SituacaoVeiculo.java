package org.example.models;

import java.util.ArrayList;
import java.util.List;

public class SituacaoVeiculo extends DadosComuns {
    private String cor;
    private int numeroDeEixos;
    private String tipoDecarroceria;
    private Double tara;
    private Double cargaTotal;
    private String statusDeCarga;

    private List<ImagemMomentoAtendimento> imagemMomentoAtendimentoList = new ArrayList<>();

    public SituacaoVeiculo(long id, String user, String dataCadastro, String dataFim, String cor, int numeroDeEixos, String tipoDecarroceria, Double tara, Double cargaTotal, String statusDeCarga, List<ImagemMomentoAtendimento> imagemMomentoAtendimentoList) {
        super(id, user, dataCadastro, dataFim);
        this.cor = cor;
        this.numeroDeEixos = numeroDeEixos;
        this.tipoDecarroceria = tipoDecarroceria;
        this.tara = tara;
        this.cargaTotal = cargaTotal;
        this.statusDeCarga = statusDeCarga;
        this.imagemMomentoAtendimentoList = imagemMomentoAtendimentoList;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumeroDeEixos() {
        return numeroDeEixos;
    }

    public void setNumeroDeEixos(int numeroDeEixos) {
        this.numeroDeEixos = numeroDeEixos;
    }

    public String getTipoDecarroceria() {
        return tipoDecarroceria;
    }

    public void setTipoDecarroceria(String tipoDecarroceria) {
        this.tipoDecarroceria = tipoDecarroceria;
    }

    public Double getTara() {
        return tara;
    }

    public void setTara(Double tara) {
        this.tara = tara;
    }

    public Double getCargaTotal() {
        return cargaTotal;
    }

    public void setCargaTotal(Double cargaTotal) {
        this.cargaTotal = cargaTotal;
    }

    public String getStatusDeCarga() {
        return statusDeCarga;
    }

    public void setStatusDeCarga(String statusDeCarga) {
        this.statusDeCarga = statusDeCarga;
    }

    public List<ImagemMomentoAtendimento> getImagemMomentoAtendimentoList() {
        return imagemMomentoAtendimentoList;
    }

    public void setImagemMomentoAtendimentoList(List<ImagemMomentoAtendimento> imagemMomentoAtendimentoList) {
        this.imagemMomentoAtendimentoList = imagemMomentoAtendimentoList;
    }
}
