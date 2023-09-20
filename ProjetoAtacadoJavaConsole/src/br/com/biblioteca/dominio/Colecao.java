package br.com.biblioteca.dominio;

import java.time.LocalDate;
import java.util.List;

public class Colecao extends BaseBiblioteca {
    private String editora;
    private List<Livro> livros;

    public String getEditora() {
        return editora;
    }
    
    public void setEditora(String editora) {
        this.editora = editora;
    }
    
    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public Colecao() {
    }

    public Colecao(int codigo, String descricao, LocalDate dataCadastro, String editora) {
        super(codigo, descricao, dataCadastro);
        this.editora = editora;
    }

    @Override
    public String toString() {
        return "Colecao [" +
                "editora=" + editora +
                ", livros=" + livros +
                ", codigoBiblioteca=" + codigoBiblioteca +
                ", descricaoBiblioteca=" + descricaoBiblioteca +
                ", dataCadastroBiblioteca=" + dataCadastroBiblioteca +
                "]";
    }

    @Override
    public void Imprimir() {
        System.out.println("--- Detalhes de Coleções ---");
        System.out.println("Editora: " + editora);
        System.out.println("Livros: " + livros);
        System.out.println("Código da Biblioteca: " + codigoBiblioteca);
        System.out.println("Descrição da Biblioteca: " + descricaoBiblioteca);
        System.out.println("Data de Cadastro da Biblioteca: " + dataCadastroBiblioteca);
    }
}
