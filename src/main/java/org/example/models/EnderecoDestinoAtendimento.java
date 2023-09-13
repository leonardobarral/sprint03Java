package org.example.models;

public class EnderecoDestinoAtendimento extends Endereco{
    public EnderecoDestinoAtendimento(long id, String user, String dataCadastro, String dataFim, long idLogradouro, int numeroRua, String pontoReferencia, long coordenadaLatitude, long coordenadaLongetude) {
        super(id, user, dataCadastro, dataFim, idLogradouro, numeroRua, pontoReferencia, coordenadaLatitude, coordenadaLongetude);
    }
}
