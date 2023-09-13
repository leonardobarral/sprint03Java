package org.example.models;

public class PortoChamado extends DadosComuns{
    private String dataHoraAtendimento;
    private String duracaoAtendimento;

    public PortoChamado(long id, String user, String dataCadastro, String dataFim, String dataHoraAtendimento, String duracaoAtendimento) {
        super(id, user, dataCadastro, dataFim);
        this.dataHoraAtendimento = dataHoraAtendimento;
        this.duracaoAtendimento = duracaoAtendimento;
    }

    public String getDataHoraAtendimento() {
        return dataHoraAtendimento;
    }

    public void setDataHoraAtendimento(String dataHoraAtendimento) {
        this.dataHoraAtendimento = dataHoraAtendimento;
    }

    public String getDuracaoAtendimento() {
        return duracaoAtendimento;
    }

    public void setDuracaoAtendimento(String duracaoAtendimento) {
        this.duracaoAtendimento = duracaoAtendimento;
    }
}
