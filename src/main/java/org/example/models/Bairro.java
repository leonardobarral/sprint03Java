package org.example.models;

import java.util.ArrayList;
import java.util.List;

public class Bairro extends DadosComuns{
    private long idCidade;
    private String bairro;
    private String zonaBairro;

    private List<Logradouro> logradouros = new ArrayList<>();

    public Bairro(long id, String user, String dataCadastro, String dataFim, long idCidade, String bairro, String zonaBairro, List<Logradouro> logradouros) {
        super(id, user, dataCadastro, dataFim);
        this.idCidade = idCidade;
        this.bairro = bairro;
        this.zonaBairro = zonaBairro;
        this.logradouros = logradouros;
    }

    public long getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(long idCidade) {
        this.idCidade = idCidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getZonaBairro() {
        return zonaBairro;
    }

    public void setZonaBairro(String zonaBairro) {
        this.zonaBairro = zonaBairro;
    }

    public List<Logradouro> getLogradouros() {
        return logradouros;
    }

    public void setLogradouros(List<Logradouro> logradouros) {
        this.logradouros = logradouros;
    }
}
