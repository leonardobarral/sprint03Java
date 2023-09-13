package org.example.models;

import java.util.ArrayList;
import java.util.List;

public class Apolice extends DadosComuns{
    private String status;
    private String vigencia;
    private String dataCancelamemto;
    private String dataEncerramento;

    private List<VeiculoApolice> VeiculoApolices = new ArrayList<>();

    public Apolice(long id, String user, String dataCadastro, String dataFim, String status, String vigencia, String dataCancelamemto, String dataEncerramento, List<VeiculoApolice> veiculoApolices) {
        super(id, user, dataCadastro, dataFim);
        this.status = status;
        this.vigencia = vigencia;
        this.dataCancelamemto = dataCancelamemto;
        this.dataEncerramento = dataEncerramento;
        VeiculoApolices = veiculoApolices;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getVigencia() {
        return vigencia;
    }

    public void setVigencia(String vigencia) {
        this.vigencia = vigencia;
    }

    public String getDataCancelamemto() {
        return dataCancelamemto;
    }

    public void setDataCancelamemto(String dataCancelamemto) {
        this.dataCancelamemto = dataCancelamemto;
    }

    public String getDataEncerramento() {
        return dataEncerramento;
    }

    public void setDataEncerramento(String dataEncerramento) {
        this.dataEncerramento = dataEncerramento;
    }

    public List<VeiculoApolice> getVeiculoApolices() {
        return VeiculoApolices;
    }

    public void setVeiculoApolices(List<VeiculoApolice> veiculoApolices) {
        VeiculoApolices = veiculoApolices;
    }
}
