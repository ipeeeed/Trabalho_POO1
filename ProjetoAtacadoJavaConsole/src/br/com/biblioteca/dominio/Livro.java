package br.com.biblioteca.dominio;

import java.time.LocalDate;

public class Livro extends BaseBiblioteca {
    private String codigoISBN;
    private int codigoLivro;
    private String tituloLivro;
    
    public String getCodigoISBN() {
        return codigoISBN;
    }

    public void setCodigoISBN(String codigoISBN) {
        this.codigoISBN = codigoISBN;
    }

    public int getCodigo() {
        return codigoLivro;
    }

    public void setCodigo(int codigoAutor) {
        this.codigoLivro = codigoAutor;
    }

    public String getTitulo() {
        return tituloLivro;
    }

    public void setTitulo(String titulo) {
        this.tituloLivro = titulo;
    }

    public Livro() {
    }

    public Livro(int codigo, String descricao, LocalDate dataCadastro, String codigoISBN, int codigoAutor,
            String titulo) {
        super(codigo, descricao, dataCadastro);
        this.codigoISBN = codigoISBN;
        this.codigoLivro = codigoAutor;
        this.tituloLivro = titulo;
    }

    @Override
    public String toString() {
        return "Livro [codigoISBN=" + codigoISBN +
        ", codigoAutor=" + codigoLivro +
        ", codigo=" + codigoBiblioteca +
        ", titulo=" + tituloLivro +
        ", descricao=" + descricaoBiblioteca +
        ", dataCadastro=" + dataCadastroBiblioteca +
        "]";
    }

    @Override
    public void Imprimir() {
        System.out.println("--- Detalhes dos Livros ---");
        System.out.println("Código ISBN: " + codigoISBN);
        System.out.println("Código do Livro: " + codigoLivro);
        System.out.println("Código da Biblioteca: " + codigoBiblioteca);
        System.out.println("Título do Livro: " + tituloLivro);
        System.out.println("Descrição da Biblioteca: " + descricaoBiblioteca);
        System.out.println("Data de Cadastro da Biblioteca" + dataCadastroBiblioteca);
    }
}
