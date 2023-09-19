package br.com.banco.dominio;

import java.time.LocalDate;

public abstract class BaseBanco {
    protected int codigoBanco;
    protected String descricaoBanco;
    protected LocalDate dataInclusaoBanco;
    protected Boolean ativoBanco;

    public int getCodigo() {
        return codigoBanco;
    }

    public void setCodigo(int codigo) {
        this.codigoBanco = codigo;
    }

    public String getDescricao() {
        return descricaoBanco;
    }

    public void setDescricao(String descricao) {
        this.descricaoBanco = descricao;
    }

    public LocalDate getDataInclusao() {
        return dataInclusaoBanco;
    }

    public void setDataInclusao(LocalDate dataInclusao) {
        this.dataInclusaoBanco = dataInclusao;
    }

    public Boolean getAtivo() {
        return ativoBanco;
    }

    public void setAtivo(Boolean ativo) {
        this.ativoBanco = ativo;
    }

    public BaseBanco() {
    }

    public BaseBanco(int codigo, String descricao, LocalDate dataInclusao, Boolean ativo) {
        this.codigoBanco = codigo;
        this.descricaoBanco = descricao;
        this.dataInclusaoBanco = dataInclusao;
        this.ativoBanco = ativo;
    }

    public abstract void Imprimir();
}
