package br.com.transporte.dominio;

import java.time.LocalDate;

public abstract class BaseTransporte {
    protected int codigoTransporte;
    protected String descricaoTransporte;
    protected LocalDate dataInclusaoTransporte;

    public int getCodigo() {
        return codigoTransporte;
    }

    public void setCodigo(int codigo) {
        this.codigoTransporte = codigo;
    }

    public String getDescricao() {
        return descricaoTransporte;
    }

    public void setDescricao(String descricao) {
        this.descricaoTransporte = descricao;
    }

    public LocalDate getDataInsert() {
        return dataInclusaoTransporte;
    }

    public void setDataInsert(LocalDate dataInsert) {
        this.dataInclusaoTransporte = dataInsert;
    }

    public BaseTransporte() {
    }

    public BaseTransporte(int codigo, String descricao, LocalDate dataInsert) {
        this.codigoTransporte = codigo;
        this.descricaoTransporte = descricao;
        this.dataInclusaoTransporte = dataInsert;
    }

    public abstract void Imprimir();
}