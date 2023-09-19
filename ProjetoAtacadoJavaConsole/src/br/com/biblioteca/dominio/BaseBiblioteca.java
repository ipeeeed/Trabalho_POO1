package br.com.biblioteca.dominio;

import java.time.LocalDate;

public abstract class BaseBiblioteca {
    protected int codigoBiblioteca;
    protected String descricaoBiblioteca;
    protected LocalDate dataCadastroBiblioteca;

    public int getCodigo() {
        return codigoBiblioteca;
    }

    public void setCodigo(int codigo) {
        this.codigoBiblioteca = codigo;
    }

    public String getDescricao() {
        return descricaoBiblioteca;
    }

    public void setDescricao(String descricao) {
        this.descricaoBiblioteca = descricao;
    }

    public LocalDate getDataCadastro() {
        return dataCadastroBiblioteca;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastroBiblioteca = dataCadastro;
    }

    public BaseBiblioteca() {
    }

    public BaseBiblioteca(int codigo, String descricao, LocalDate dataCadastro) {
        this.codigoBiblioteca = codigo;
        this.descricaoBiblioteca = descricao;
        this.dataCadastroBiblioteca = dataCadastro;
    }

    public abstract void Imprimir();
}
