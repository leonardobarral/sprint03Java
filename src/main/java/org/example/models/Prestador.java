package org.example.models;

import java.util.ArrayList;
import java.util.List;

public class Prestador extends DadosComuns {
    private String nome;
    private String matricula;

    private List<EmailPrestador> emailPrestadorList = new ArrayList<>();
    private List<TelefonePrestador> telefonePrestadorList = new ArrayList<>();
    private List<PrestadorDoChamado> prestadorDoChamadoList = new ArrayList<>();

    public Prestador(long id, String user, String dataCadastro, String dataFim, String nome, String matricula, List<EmailPrestador> emailPrestadorList, List<TelefonePrestador> telefonePrestadorList, List<PrestadorDoChamado> prestadorDoChamadoList) {
        super(id, user, dataCadastro, dataFim);
        this.nome = nome;
        this.matricula = matricula;
        this.emailPrestadorList = emailPrestadorList;
        this.telefonePrestadorList = telefonePrestadorList;
        this.prestadorDoChamadoList = prestadorDoChamadoList;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public List<EmailPrestador> getEmailPrestadorList() {
        return emailPrestadorList;
    }

    public void setEmailPrestadorList(List<EmailPrestador> emailPrestadorList) {
        this.emailPrestadorList = emailPrestadorList;
    }

    public List<TelefonePrestador> getTelefonePrestadorList() {
        return telefonePrestadorList;
    }

    public void setTelefonePrestadorList(List<TelefonePrestador> telefonePrestadorList) {
        this.telefonePrestadorList = telefonePrestadorList;
    }

    public List<PrestadorDoChamado> getPrestadorDoChamadoList() {
        return prestadorDoChamadoList;
    }

    public void setPrestadorDoChamadoList(List<PrestadorDoChamado> prestadorDoChamadoList) {
        this.prestadorDoChamadoList = prestadorDoChamadoList;
    }
}
