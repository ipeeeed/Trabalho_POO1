package br.com.atacado.dominio;

import java.time.LocalDate;
import java.util.List;

public class Subcategoria extends BaseAtacado {
    private int codigoSubcategoria;
    private int codigoCategoria;
    private String descricaoSubcategoria;
    private LocalDate dataDeInclusaoSubcategoria;
    private List<Produto> produtos;

    public int getCodigo() {
        return codigoSubcategoria;
    }

    public void setCodigo(int codigo) {
        this.codigoSubcategoria = codigo;
    }

    public int getCodigoCategoria() {
        return codigoCategoria;
    }

    public void setCodigoCategoria(int codigoCategoria) {
        this.codigoCategoria = codigoCategoria;
    }

    public String getDescricao() {
        return descricaoSubcategoria;
    }

    public void setDescricao(String descricao) {
        this.descricaoSubcategoria = descricao;
    }

    public LocalDate getDataDeInclusao() {
        return dataDeInclusaoSubcategoria;
    }

    public void setDataDeInclusao(LocalDate dataDeInclusao) {
        this.dataDeInclusaoSubcategoria = dataDeInclusao;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Subcategoria() {
    }

    public Subcategoria(int codigo, String descricao, LocalDate dataDeInclusao, int codigoCategoria) {
        this.codigoSubcategoria = codigo;
        this.codigoCategoria = codigoCategoria;
        this.descricaoSubcategoria = descricao;
        this.dataDeInclusaoSubcategoria = dataDeInclusao;
    }

    @Override
    public String toString() {
        return "Subcategoria [" +
                "codigoSubcategoria=" + codigoSubcategoria +
                ", codigoCategoria=" + codigoCategoria +
                ", descricaoSubcategoria=" + descricaoSubcategoria +
                ", dataDeInclusaoSubcategoria=" + dataDeInclusaoSubcategoria +
                "]";
    }

    @Override
    public void Imprimir() {
        System.out.println("--- Detalhes de Subcategorias ---");
        System.out.println("Código da Subcategoria: " + codigoSubcategoria);
        System.out.println("Código da Categoria: " + codigoCategoria);
        System.out.println("Descrição da Subcategoria: " + descricaoSubcategoria);
        System.out.println("Data de Inclusão da Subcategoria: " + dataDeInclusaoSubcategoria);
    }
}