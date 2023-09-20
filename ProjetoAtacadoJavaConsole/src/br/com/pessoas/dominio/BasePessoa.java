package br.com.pessoas.dominio;

import java.time.LocalDate;

public abstract class BasePessoa {
    protected int codigoPessoa;
    protected String nomePessoa;
    protected String emailPessoa;
    protected String sitePessoa;
    protected LocalDate dataInclusaoPessoa;

    public int getCodigo() {
        return codigoPessoa;
    }

    public void setCodigo(int codigoPessoa) {
        this.codigoPessoa = codigoPessoa;
    }

    public String getNome() {
        return nomePessoa;
    }

    public void setNome(String nome) {
        this.nomePessoa = nome;
    }

    public String getEmail() {
        return emailPessoa;
    }

    public void setEmail(String email) {
        this.emailPessoa = email;
    }

    public String getSite() {
        return sitePessoa;
    }

    public void setSite(String site) {
        this.sitePessoa = site;
    }

    public LocalDate getDataInclusao() {
        return dataInclusaoPessoa;
    }

    public void setDataInclusao(LocalDate dataInclusao) {
        this.dataInclusaoPessoa = dataInclusao;
    }

    public BasePessoa() {
    }

    public BasePessoa(int codigoPessoa, String nome, String email, String site, LocalDate dataInclusao) {
        this.codigoPessoa = codigoPessoa;
        this.nomePessoa = nome;
        this.emailPessoa = email;
        this.sitePessoa = site;
        this.dataInclusaoPessoa = dataInclusao;
    }

    public abstract void Imprimir();
}