package org.example.models;

public class Email extends DadosComuns{
    private String email;
    private String tipo;
    private String status;

    public Email(long id, String user, String dataCadastro, String dataFim, String email, String tipo, String status) {
        super(id, user, dataCadastro, dataFim);
        this.email = email;
        this.tipo = tipo;
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
