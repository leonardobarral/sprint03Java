package org.example.models;

import java.util.ArrayList;
import java.util.List;

public class AtendentePorto extends DadosComuns{

    private String atendente;
    private String matricula;

    private List<PortoChamado> portoChamadoList = new ArrayList<>();
    private List<TelefonePorto> telefonePortoList = new ArrayList<>();
    private List<EmailPorto> emailPortoList = new ArrayList<>();

    public AtendentePorto(long id, String user, String dataCadastro, String dataFim, String atendente, String matricula, List<PortoChamado> portoChamadoList, List<TelefonePorto> telefonePortoList, List<EmailPorto> emailPortoList) {
        super(id, user, dataCadastro, dataFim);
        this.atendente = atendente;
        this.matricula = matricula;
        this.portoChamadoList = portoChamadoList;
        this.telefonePortoList = telefonePortoList;
        this.emailPortoList = emailPortoList;
    }

    public String getAtendente() {
        return atendente;
    }

    public void setAtendente(String atendente) {
        this.atendente = atendente;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public List<PortoChamado> getPortoChamadoList() {
        return portoChamadoList;
    }

    public void setPortoChamadoList(List<PortoChamado> portoChamadoList) {
        this.portoChamadoList = portoChamadoList;
    }

    public List<TelefonePorto> getTelefonePortoList() {
        return telefonePortoList;
    }

    public void setTelefonePortoList(List<TelefonePorto> telefonePortoList) {
        this.telefonePortoList = telefonePortoList;
    }

    public List<EmailPorto> getEmailPortoList() {
        return emailPortoList;
    }

    public void setEmailPortoList(List<EmailPorto> emailPortoList) {
        this.emailPortoList = emailPortoList;
    }
}
