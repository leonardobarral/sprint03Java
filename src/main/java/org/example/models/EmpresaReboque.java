package org.example.models;

import java.util.ArrayList;
import java.util.List;

public class EmpresaReboque extends DadosComuns{
    private String razaoSocial;
    private String nomeFantazia;
    private String cnpj;

    private List<Prestador> prestadorList = new ArrayList<>();

    public EmpresaReboque(long id, String user, String dataCadastro, String dataFim, String razaoSocial, String nomeFantazia, String cnpj, List<Prestador> prestadorList) {
        super(id, user, dataCadastro, dataFim);
        this.razaoSocial = razaoSocial;
        this.nomeFantazia = nomeFantazia;
        this.cnpj = cnpj;
        this.prestadorList = prestadorList;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantazia() {
        return nomeFantazia;
    }

    public void setNomeFantazia(String nomeFantazia) {
        this.nomeFantazia = nomeFantazia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<Prestador> getPrestadorList() {
        return prestadorList;
    }

    public void setPrestadorList(List<Prestador> prestadorList) {
        this.prestadorList = prestadorList;
    }
}
