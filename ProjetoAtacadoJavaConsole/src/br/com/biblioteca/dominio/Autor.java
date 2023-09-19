package br.com.biblioteca.dominio;

import java.time.LocalDate;

public class Autor extends BaseBiblioteca {
    private int codigoAutor;
    private String nomeAutor;
    private String sobreNomeAutor;
    
    public int getCodigoAutor() {
        return codigoAutor;
    }

    public void setCodigoAutor(int codigoAutor) {
        this.codigoAutor = codigoAutor;
    }

    public String getNome() {
        return nomeAutor;
    }

    public void setNome(String nome) {
        this.nomeAutor = nome;
    }

    public String getSobreNome() {
        return sobreNomeAutor;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNomeAutor = sobreNome;
    }

    public Autor() {
    }

    public Autor(int codigo, String descricao, LocalDate dataCadastro, String nome, String sobreNome, int codigoAutor) {
        super(codigo, descricao, dataCadastro);
        this.codigoAutor = codigoAutor;
        this.nomeAutor = nome;
        this.sobreNomeAutor = sobreNome;
    }

    @Override
    public String toString() {
        return "Autor [codigoAutor=" + codigoAutor +
        ", nome=" + nomeAutor +
        ", sobreNome=" + sobreNomeAutor +
        ", codigo=" + codigoBiblioteca +
        ", descricao=" + descricaoBiblioteca +
        ", dataCadastro=" + dataCadastroBiblioteca +
        "]";
    }

    @Override
    public void Imprimir() {
        
    }
}
