package org.example.models;

public class DadosComuns {
    private long id;
    private String user;
    private String dataCadastro;
    private String dataFim;

    public DadosComuns(long id, String user, String dataCadastro, String dataFim) {
        this.id = id;
        this.user = user;
        this.dataCadastro = dataCadastro;
        this.dataFim = dataFim;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }
}
