package br.com.atacado.dominio;

import java.time.LocalDate;

public class Produto extends BaseAtacado {
    private int codigoProduto;
    private int codigoSubcategoria;
    private int codigoCategoria;
    private String descricaoProduto;
    private double valorProduto;
    private LocalDate dataDeInclusaoProduto;

    public int getCodigo() {
        return codigoProduto;
    }

    public void setCodigo(int codigo) {
        this.codigoProduto = codigo;
    }

    public int getCodigoSubcategoria() {
        return codigoSubcategoria;
    }

    public void setCodigoSubcategoria(int codigoSubcategoria) {
        this.codigoSubcategoria = codigoSubcategoria;
    }

    public String getDescricao() {
        return descricaoProduto;
    }

    public void setDescricao(String descricao) {
        this.descricaoProduto = descricao;
    }

    public double getValor() {
        return valorProduto;
    }

    public void setValor(double valor) {
        this.valorProduto = valor;
    }

    public LocalDate getDataDeInclusao() {
        return dataDeInclusaoProduto;
    }

    public void setDataDeInclusao(LocalDate dataDeInclusao) {
        this.dataDeInclusaoProduto = dataDeInclusao;
    }

    public int getCodigoCategoria() {
        return codigoCategoria;
    }

    public void setCodigoCategoria(int codigoCategoria) {
        this.codigoCategoria = codigoCategoria;
    }

    public Produto() {
    }

    public Produto(int codigo, int codigoSubcategoria, int codigoCategoria, String descricao,
            LocalDate dataDeInclusao) {
        this.codigoProduto = codigo;
        this.codigoSubcategoria = codigoSubcategoria;
        this.codigoCategoria = codigoCategoria;
        this.descricaoProduto = descricao;
        this.valorProduto = 0.0;
        this.dataDeInclusaoProduto = dataDeInclusao;
    }

    @Override
    public String toString() {
        return "Produto [codigoProduto=" + codigoProduto +
        ", codigoSubcategoria=" + codigoSubcategoria +
        ", codigoCategoria=" + codigoCategoria +
        ", descricaoProduto=" + descricaoProduto +
        ", valorProduto=" + valorProduto +
        ", dataDeInclusaoProduto=" + dataDeInclusaoProduto +
        "]";
    }

    @Override
    public void Imprimir() {
        System.out.println("--- Detalhes de Produtos ---");
        System.out.println("Código do Produto: " + codigoProduto);
        System.out.println("Código da Subcategoria: " + codigoSubcategoria);
        System.out.println("Código da Categoria: " + codigoCategoria);
        System.out.println("Descrição do Produto: " + descricaoProduto);
        System.out.println("Valor do Produto: " + valorProduto);
        System.out.println("Data de Inclusão do Produto: " + dataDeInclusaoProduto);
    }
}