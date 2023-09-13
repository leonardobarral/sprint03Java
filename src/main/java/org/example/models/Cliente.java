package org.example.models;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends DadosComuns{
    private String nome;
    private String cpf;

    private List<Apolice> apolices = new ArrayList<>();
    private List<TelefoneCliente> telefoneClientes = new ArrayList<>();
    private List<EnderecoCliente> enderecoClientes = new ArrayList<>();
    private List<EmailCliente> emailClientes = new ArrayList<>();

    public Cliente(long id, String user, String dataCadastro, String dataFim, String nome, String cpf, List<Apolice> apolices, List<TelefoneCliente> telefoneClientes, List<EnderecoCliente> enderecoClientes, List<EmailCliente> emailClientes) {
        super(id, user, dataCadastro, dataFim);
        this.nome = nome;
        this.cpf = cpf;
        this.apolices = apolices;
        this.telefoneClientes = telefoneClientes;
        this.enderecoClientes = enderecoClientes;
        this.emailClientes = emailClientes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Apolice> getApolices() {
        return apolices;
    }

    public void setApolices(List<Apolice> apolices) {
        this.apolices = apolices;
    }

    public List<TelefoneCliente> getTelefoneClientes() {
        return telefoneClientes;
    }

    public void setTelefoneClientes(List<TelefoneCliente> telefoneClientes) {
        this.telefoneClientes = telefoneClientes;
    }

    public List<EnderecoCliente> getEnderecoClientes() {
        return enderecoClientes;
    }

    public void setEnderecoClientes(List<EnderecoCliente> enderecoClientes) {
        this.enderecoClientes = enderecoClientes;
    }

    public List<EmailCliente> getEmailClientes() {
        return emailClientes;
    }

    public void setEmailClientes(List<EmailCliente> emailClientes) {
        this.emailClientes = emailClientes;
    }
}
