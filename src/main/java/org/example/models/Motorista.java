package org.example.models;

import java.util.ArrayList;
import java.util.List;

public class Motorista extends DadosComuns{

    private String nome;
    private long cpf;

    private List<TelefoneMotorista> telefoneMotoristaList = new ArrayList<>();

    public Motorista(long id, String user, String dataCadastro, String dataFim, String nome, long cpf, List<TelefoneMotorista> telefoneMotoristaList) {
        super(id, user, dataCadastro, dataFim);
        this.nome = nome;
        this.cpf = cpf;
        this.telefoneMotoristaList = telefoneMotoristaList;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public List<TelefoneMotorista> getTelefoneMotoristaList() {
        return telefoneMotoristaList;
    }

    public void setTelefoneMotoristaList(List<TelefoneMotorista> telefoneMotoristaList) {
        this.telefoneMotoristaList = telefoneMotoristaList;
    }
}
