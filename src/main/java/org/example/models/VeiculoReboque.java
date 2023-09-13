package org.example.models;

import java.util.ArrayList;
import java.util.List;

public class VeiculoReboque extends DadosComuns{
    private String categoriaTarifaria;
    private String capacidadeCargaTotal;
    private String categoria;
    private String tipoDePlataforma;
    private List<AtendimentoReboque> atendimentoReboqueList = new ArrayList<>();
    private List<EnderecoOrigemReboque> enderecoOrigemReboques = new ArrayList<>();
    private List<PrestadorDoChamado> prestadorDoChamadoList = new ArrayList<>();

    public VeiculoReboque(long id, String user, String dataCadastro, String dataFim, String categoriaTarifaria, String capacidadeCargaTotal, String categoria, String tipoDePlataforma, List<AtendimentoReboque> atendimentoReboqueList, List<EnderecoOrigemReboque> enderecoOrigemReboques, List<PrestadorDoChamado> prestadorDoChamadoList) {
        super(id, user, dataCadastro, dataFim);
        this.categoriaTarifaria = categoriaTarifaria;
        this.capacidadeCargaTotal = capacidadeCargaTotal;
        this.categoria = categoria;
        this.tipoDePlataforma = tipoDePlataforma;
        this.atendimentoReboqueList = atendimentoReboqueList;
        this.enderecoOrigemReboques = enderecoOrigemReboques;
        this.prestadorDoChamadoList = prestadorDoChamadoList;
    }

    public String getCategoriaTarifaria() {
        return categoriaTarifaria;
    }

    public void setCategoriaTarifaria(String categoriaTarifaria) {
        this.categoriaTarifaria = categoriaTarifaria;
    }

    public String getCapacidadeCargaTotal() {
        return capacidadeCargaTotal;
    }

    public void setCapacidadeCargaTotal(String capacidadeCargaTotal) {
        this.capacidadeCargaTotal = capacidadeCargaTotal;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTipoDePlataforma() {
        return tipoDePlataforma;
    }

    public void setTipoDePlataforma(String tipoDePlataforma) {
        this.tipoDePlataforma = tipoDePlataforma;
    }

    public List<AtendimentoReboque> getAtendimentoReboqueList() {
        return atendimentoReboqueList;
    }

    public void setAtendimentoReboqueList(List<AtendimentoReboque> atendimentoReboqueList) {
        this.atendimentoReboqueList = atendimentoReboqueList;
    }

    public List<EnderecoOrigemReboque> getEnderecoOrigemReboques() {
        return enderecoOrigemReboques;
    }

    public void setEnderecoOrigemReboques(List<EnderecoOrigemReboque> enderecoOrigemReboques) {
        this.enderecoOrigemReboques = enderecoOrigemReboques;
    }

    public List<PrestadorDoChamado> getPrestadorDoChamadoList() {
        return prestadorDoChamadoList;
    }

    public void setPrestadorDoChamadoList(List<PrestadorDoChamado> prestadorDoChamadoList) {
        this.prestadorDoChamadoList = prestadorDoChamadoList;
    }
}
