package org.example.models;

public class Telefone extends DadosComuns{
    private int ddi;
    private int ddd;
    private long numero;
    private String tipoDeTelefone;
    private String statusDoTelefone;

    public Telefone(long id, String user, String dataCadastro, String dataFim, int ddi, int ddd, long numero, String tipoDeTelefone, String statusDoTelefone) {
        super(id, user, dataCadastro, dataFim);
        this.ddi = ddi;
        this.ddd = ddd;
        this.numero = numero;
        this.tipoDeTelefone = tipoDeTelefone;
        this.statusDoTelefone = statusDoTelefone;
    }

    public int getDdi() {
        return ddi;
    }

    public void setDdi(int ddi) {
        this.ddi = ddi;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public String getTipoDeTelefone() {
        return tipoDeTelefone;
    }

    public void setTipoDeTelefone(String tipoDeTelefone) {
        this.tipoDeTelefone = tipoDeTelefone;
    }

    public String getStatusDoTelefone() {
        return statusDoTelefone;
    }

    public void setStatusDoTelefone(String statusDoTelefone) {
        this.statusDoTelefone = statusDoTelefone;
    }
}
