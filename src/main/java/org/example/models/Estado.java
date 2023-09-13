package org.example.models;

import java.util.ArrayList;
import java.util.List;

public class Estado extends DadosComuns{
    private String sigla;
    private String nome;
    private String NomeDoPais;
    private String siglaDoPais;

    private List<Estado> estados = new ArrayList<>();

    public Estado(long id, String user, String dataCadastro, String dataFim, String sigla, String nome, String nomeDoPais, String siglaDoPais, List<Estado> estados) {
        super(id, user, dataCadastro, dataFim);
        this.sigla = sigla;
        this.nome = nome;
        NomeDoPais = nomeDoPais;
        this.siglaDoPais = siglaDoPais;
        this.estados = estados;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeDoPais() {
        return NomeDoPais;
    }

    public void setNomeDoPais(String nomeDoPais) {
        NomeDoPais = nomeDoPais;
    }

    public String getSiglaDoPais() {
        return siglaDoPais;
    }

    public void setSiglaDoPais(String siglaDoPais) {
        this.siglaDoPais = siglaDoPais;
    }

    public List<Estado> getEstados() {
        return estados;
    }

    public void setEstados(List<Estado> estados) {
        this.estados = estados;
    }
}
