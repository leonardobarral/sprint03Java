package org.example.models;

public class Endereco extends DadosComuns{
    private long idLogradouro;
    private int numeroRua;
    private String pontoReferencia;
    private long coordenadaLatitude;
    private long coordenadaLongetude;

    public Endereco(long id, String user, String dataCadastro, String dataFim, long idLogradouro, int numeroRua, String pontoReferencia, long coordenadaLatitude, long coordenadaLongetude) {
        super(id, user, dataCadastro, dataFim);
        this.idLogradouro = idLogradouro;
        this.numeroRua = numeroRua;
        this.pontoReferencia = pontoReferencia;
        this.coordenadaLatitude = coordenadaLatitude;
        this.coordenadaLongetude = coordenadaLongetude;
    }

    public long getIdLogradouro() {
        return idLogradouro;
    }

    public void setIdLogradouro(long idLogradouro) {
        this.idLogradouro = idLogradouro;
    }

    public int getNumeroRua() {
        return numeroRua;
    }

    public void setNumeroRua(int numeroRua) {
        this.numeroRua = numeroRua;
    }

    public String getPontoReferencia() {
        return pontoReferencia;
    }

    public void setPontoReferencia(String pontoReferencia) {
        this.pontoReferencia = pontoReferencia;
    }

    public long getCoordenadaLatitude() {
        return coordenadaLatitude;
    }

    public void setCoordenadaLatitude(long coordenadaLatitude) {
        this.coordenadaLatitude = coordenadaLatitude;
    }

    public long getCoordenadaLongetude() {
        return coordenadaLongetude;
    }

    public void setCoordenadaLongetude(long coordenadaLongetude) {
        this.coordenadaLongetude = coordenadaLongetude;
    }
}
