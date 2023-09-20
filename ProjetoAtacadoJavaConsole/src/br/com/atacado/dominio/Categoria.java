package br.com.atacado.dominio;

import java.time.LocalDate;
import java.util.List;

public class Categoria extends BaseAtacado {
    private int codigoCategoria;
    private String descricaoCategoria;
    private LocalDate dataDeInclusaoCategoria;
    private List<Subcategoria> subcategorias;

    public int getCodigo() {
        return codigoCategoria;
    }

    public void setCodigo(int codigo) {
        this.codigoCategoria = codigo;
    }

    public String getDescricao() {
        return descricaoCategoria;
    }

    public void setDescricao(String descricao) {
        this.descricaoCategoria = descricao;
    }

    public LocalDate getDataDeInclusao() {
        return dataDeInclusaoCategoria;
    }

    public void setDataDeInclusao(LocalDate dataDeInclusao) {
        this.dataDeInclusaoCategoria = dataDeInclusao;
    }

    public List<Subcategoria> getSubcategorias() {
        return subcategorias;
    }

    public void setSubcategorias(List<Subcategoria> subcategorias) {
        this.subcategorias = subcategorias;
    }

    public Categoria() {
    }

    public Categoria(int codigo, String descricao, LocalDate dataDeInclusao) {
        this.codigoCategoria = codigo;
        this.descricaoCategoria = descricao;
        this.dataDeInclusaoCategoria = dataDeInclusao;
    }

    @Override
    public String toString() {
        return "Categoria [" + 
                "codigoCategoria=" + codigoCategoria +
                ", descricaoCategoria=" + descricaoCategoria +
                ", dataDeInclusaoCategoria=" + dataDeInclusaoCategoria +
                "]";
    }

    @Override
    public void Imprimir() {
        System.out.println("--- Detalhes de Categorias ---");
        System.out.println("Código da Categoria: " + codigoCategoria);
        System.out.println("Descrição da Categoria: " + descricaoCategoria);
        System.out.println("Data de Inclusão da Categoria: " + dataDeInclusaoCategoria);
    }
}