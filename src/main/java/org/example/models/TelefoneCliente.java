package org.example.models;

public class TelefoneCliente extends Telefone{
    public TelefoneCliente(long id, String user, String dataCadastro, String dataFim, int ddi, int ddd, long numero, String tipoDeTelefone, String statusDoTelefone) {
        super(id, user, dataCadastro, dataFim, ddi, ddd, numero, tipoDeTelefone, statusDoTelefone);
    }

}
