package org.example.models;

import java.util.ArrayList;
import java.util.List;

public class Cidade extends DadosComuns{
    private long idEstado;
    private String nome;
    private String codigoDoIbge;

    private List<Bairro> bairros = new ArrayList<>();

    public Cidade(long id, String user, String dataCadastro, String dataFim, long idEstado, String nome, String codigoDoIbge, List<Bairro> bairros) {
        super(id, user, dataCadastro, dataFim);
        this.idEstado = idEstado;
        this.nome = nome;
        this.codigoDoIbge = codigoDoIbge;
        this.bairros = bairros;
    }

    public long getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(long idEstado) {
        this.idEstado = idEstado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigoDoIbge() {
        return codigoDoIbge;
    }

    public void setCodigoDoIbge(String codigoDoIbge) {
        this.codigoDoIbge = codigoDoIbge;
    }

    public List<Bairro> getBairros() {
        return bairros;
    }

    public void setBairros(List<Bairro> bairros) {
        this.bairros = bairros;
    }
}
