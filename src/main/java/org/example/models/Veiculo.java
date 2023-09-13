package org.example.models;

import java.util.ArrayList;
import java.util.List;

public class Veiculo extends DadosComuns{

    private String placa;
    private long chassi;
    private long renavan;
    private String marca;
    private String modelo;
    private int anoFavricacao;
    private String cor;
    private String categoria;
    private int numeroDeEixos;
    private String tipoDeCarroceria;
    private String tara;
    private String categoriaTarifaria;

    private List<VeiculoApolice> veiculoApoliceList = new ArrayList<>();
    private List<Atendimento> atendimentos = new ArrayList<>();

    public Veiculo(long id, String user, String dataCadastro, String dataFim, String placa, long chassi, long renavan, String marca, String modelo, int anoFavricacao, String cor, String categoria, int numeroDeEixos, String tipoDeCarroceria, String tara, String categoriaTarifaria, List<VeiculoApolice> veiculoApoliceList, List<Atendimento> atendimentos) {
        super(id, user, dataCadastro, dataFim);
        this.placa = placa;
        this.chassi = chassi;
        this.renavan = renavan;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFavricacao = anoFavricacao;
        this.cor = cor;
        this.categoria = categoria;
        this.numeroDeEixos = numeroDeEixos;
        this.tipoDeCarroceria = tipoDeCarroceria;
        this.tara = tara;
        this.categoriaTarifaria = categoriaTarifaria;
        this.veiculoApoliceList = veiculoApoliceList;
        this.atendimentos = atendimentos;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public long getChassi() {
        return chassi;
    }

    public void setChassi(long chassi) {
        this.chassi = chassi;
    }

    public long getRenavan() {
        return renavan;
    }

    public void setRenavan(long renavan) {
        this.renavan = renavan;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFavricacao() {
        return anoFavricacao;
    }

    public void setAnoFavricacao(int anoFavricacao) {
        this.anoFavricacao = anoFavricacao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getNumeroDeEixos() {
        return numeroDeEixos;
    }

    public void setNumeroDeEixos(int numeroDeEixos) {
        this.numeroDeEixos = numeroDeEixos;
    }

    public String getTipoDeCarroceria() {
        return tipoDeCarroceria;
    }

    public void setTipoDeCarroceria(String tipoDeCarroceria) {
        this.tipoDeCarroceria = tipoDeCarroceria;
    }

    public String getTara() {
        return tara;
    }

    public void setTara(String tara) {
        this.tara = tara;
    }

    public String getCategoriaTarifaria() {
        return categoriaTarifaria;
    }

    public void setCategoriaTarifaria(String categoriaTarifaria) {
        this.categoriaTarifaria = categoriaTarifaria;
    }

    public List<VeiculoApolice> getVeiculoApoliceList() {
        return veiculoApoliceList;
    }

    public void setVeiculoApoliceList(List<VeiculoApolice> veiculoApoliceList) {
        this.veiculoApoliceList = veiculoApoliceList;
    }

    public List<Atendimento> getAtendimentos() {
        return atendimentos;
    }

    public void setAtendimentos(List<Atendimento> atendimentos) {
        this.atendimentos = atendimentos;
    }
}