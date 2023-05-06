package br.com.atacado.dominio;

import java.time.LocalDate;

public class Produto {
    private int codigo;
    private int codigoSubCategoria;
    private String descricao;
    private double valor;
    private LocalDate dataDeInclusao;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigoSubCategoria() {
        return codigoSubCategoria;
    }

    public void setCodigoSubCategoria(int codigoSubCategoria) {
        this.codigoSubCategoria = codigoSubCategoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getDataDeInclusao() {
        return dataDeInclusao;
    }

    public void setDataDeInclusao(LocalDate dataDeInclusao) {
        this.dataDeInclusao = dataDeInclusao;
    }

    public Produto() {
    }

    public Produto(int codigo, int codigoSubCategoria, String descricao, double valor, LocalDate dataDeInclusao) {
        this.codigo = codigo;
        this.codigoSubCategoria = codigoSubCategoria;
        this.descricao = descricao;
        this.valor = valor;
        this.dataDeInclusao = dataDeInclusao;
    }

    @Override
    public String toString() {
        return "Produto [codigo=" + codigo + ", codigoSubCategoria=" + codigoSubCategoria + ", descricao=" + descricao
                + ", valor=" + valor + ", dataDeInclusao=" + dataDeInclusao + "]";
    }

}
