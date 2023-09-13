package org.example.models;

public class TelefonePrestador extends Telefone{
    public TelefonePrestador(long id, String user, String dataCadastro, String dataFim, int ddi, int ddd, long numero, String tipoDeTelefone, String statusDoTelefone, long idPrestador) {
        super(id, user, dataCadastro, dataFim, ddi, ddd, numero, tipoDeTelefone, statusDoTelefone);
        this.idPrestador = idPrestador;
    }

    private long idPrestador;
}
