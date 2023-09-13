package org.example.models;

import java.util.ArrayList;
import java.util.List;

public class Atendimento extends DadosComuns{
    private String dataDoAtendimento;
    private String descricaoDoAtendendimento;
    private String tipoDoAtendimento;

    private List<Motorista> motoristaList = new ArrayList<>();
    private List<EnderecoDestinoAtendimento> enderecoDestinoAtendimentoList = new ArrayList<>();
    private List<EnderecoAtendimento> enderecoAtendimentoList = new ArrayList<>();
    private List<AtendimentoReboque> atendentePortoList = new ArrayList<>();
    private List<PortoChamado> portoChamadoList = new ArrayList<>();

    public Atendimento(long id, String user, String dataCadastro, String dataFim, String dataDoAtendimento, String descricaoDoAtendendimento, String tipoDoAtendimento, List<Motorista> motoristaList, List<EnderecoDestinoAtendimento> enderecoDestinoAtendimentoList, List<EnderecoAtendimento> enderecoAtendimentoList, List<AtendimentoReboque> atendentePortoList, List<PortoChamado> portoChamadoList) {
        super(id, user, dataCadastro, dataFim);
        this.dataDoAtendimento = dataDoAtendimento;
        this.descricaoDoAtendendimento = descricaoDoAtendendimento;
        this.tipoDoAtendimento = tipoDoAtendimento;
        this.motoristaList = motoristaList;
        this.enderecoDestinoAtendimentoList = enderecoDestinoAtendimentoList;
        this.enderecoAtendimentoList = enderecoAtendimentoList;
        this.atendentePortoList = atendentePortoList;
        this.portoChamadoList = portoChamadoList;
    }

    public String getDataDoAtendimento() {
        return dataDoAtendimento;
    }

    public void setDataDoAtendimento(String dataDoAtendimento) {
        this.dataDoAtendimento = dataDoAtendimento;
    }

    public String getDescricaoDoAtendendimento() {
        return descricaoDoAtendendimento;
    }

    public void setDescricaoDoAtendendimento(String descricaoDoAtendendimento) {
        this.descricaoDoAtendendimento = descricaoDoAtendendimento;
    }

    public String getTipoDoAtendimento() {
        return tipoDoAtendimento;
    }

    public void setTipoDoAtendimento(String tipoDoAtendimento) {
        this.tipoDoAtendimento = tipoDoAtendimento;
    }

    public List<Motorista> getMotoristaList() {
        return motoristaList;
    }

    public void setMotoristaList(List<Motorista> motoristaList) {
        this.motoristaList = motoristaList;
    }

    public List<EnderecoDestinoAtendimento> getEnderecoDestinoAtendimentoList() {
        return enderecoDestinoAtendimentoList;
    }

    public void setEnderecoDestinoAtendimentoList(List<EnderecoDestinoAtendimento> enderecoDestinoAtendimentoList) {
        this.enderecoDestinoAtendimentoList = enderecoDestinoAtendimentoList;
    }

    public List<EnderecoAtendimento> getEnderecoAtendimentoList() {
        return enderecoAtendimentoList;
    }

    public void setEnderecoAtendimentoList(List<EnderecoAtendimento> enderecoAtendimentoList) {
        this.enderecoAtendimentoList = enderecoAtendimentoList;
    }

    public List<AtendimentoReboque> getAtendentePortoList() {
        return atendentePortoList;
    }

    public void setAtendentePortoList(List<AtendimentoReboque> atendentePortoList) {
        this.atendentePortoList = atendentePortoList;
    }

    public List<PortoChamado> getPortoChamadoList() {
        return portoChamadoList;
    }

    public void setPortoChamadoList(List<PortoChamado> portoChamadoList) {
        this.portoChamadoList = portoChamadoList;
    }
}
