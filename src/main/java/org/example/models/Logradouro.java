package org.example.models;

import java.util.ArrayList;
import java.util.List;

public class Logradouro extends DadosComuns{
    private long idBairro;
    private String nome;
    private String cep;

    private List<EnderecoCliente> enderecoClienteList = new ArrayList<>();
    private List<EnderecoDestinoAtendimento> enderecoDestinoAtendimentos = new ArrayList<>();
    private List<EnderecoAtendimento> enderecoAtendimentos = new ArrayList<>();
    private List<EnderecoOrigemReboque> enderecoOrigemReboques = new ArrayList<>();

    public Logradouro(long id, String user, String dataCadastro, String dataFim, long idBairro, String nome, String cep, List<EnderecoCliente> enderecoClienteList, List<EnderecoDestinoAtendimento> enderecoDestinoAtendimentos, List<EnderecoAtendimento> enderecoAtendimentos, List<EnderecoOrigemReboque> enderecoOrigemReboques) {
        super(id, user, dataCadastro, dataFim);
        this.idBairro = idBairro;
        this.nome = nome;
        this.cep = cep;
        this.enderecoClienteList = enderecoClienteList;
        this.enderecoDestinoAtendimentos = enderecoDestinoAtendimentos;
        this.enderecoAtendimentos = enderecoAtendimentos;
        this.enderecoOrigemReboques = enderecoOrigemReboques;
    }

    public long getIdBairro() {
        return idBairro;
    }

    public void setIdBairro(long idBairro) {
        this.idBairro = idBairro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public List<EnderecoCliente> getEnderecoClienteList() {
        return enderecoClienteList;
    }

    public void setEnderecoClienteList(List<EnderecoCliente> enderecoClienteList) {
        this.enderecoClienteList = enderecoClienteList;
    }

    public List<EnderecoDestinoAtendimento> getEnderecoDestinoAtendimentos() {
        return enderecoDestinoAtendimentos;
    }

    public void setEnderecoDestinoAtendimentos(List<EnderecoDestinoAtendimento> enderecoDestinoAtendimentos) {
        this.enderecoDestinoAtendimentos = enderecoDestinoAtendimentos;
    }

    public List<EnderecoAtendimento> getEnderecoAtendimentos() {
        return enderecoAtendimentos;
    }

    public void setEnderecoAtendimentos(List<EnderecoAtendimento> enderecoAtendimentos) {
        this.enderecoAtendimentos = enderecoAtendimentos;
    }

    public List<EnderecoOrigemReboque> getEnderecoOrigemReboques() {
        return enderecoOrigemReboques;
    }

    public void setEnderecoOrigemReboques(List<EnderecoOrigemReboque> enderecoOrigemReboques) {
        this.enderecoOrigemReboques = enderecoOrigemReboques;
    }
}
