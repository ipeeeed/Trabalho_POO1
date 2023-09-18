package br.com.biblioteca.fakeDB;

import java.time.LocalDate;

import br.com.biblioteca.dominio.Livro;

public class LivroFakeDB extends BaseFakeDB<Livro> {

    @Override
    public void AutoFill() {
        this.tabela.add(new Livro(1, "", LocalDate.now(), "987954921", 1, "As Crônicas de Gelo e Fogo - A Guerra dos Tronos"));
        this.tabela.add(new Livro(2, "", LocalDate.now(), "987945612", 1, "As Crônicas de Gelo e Fogo - A Fúria dos Reis"));
        this.tabela.add(new Livro(3, "", LocalDate.now(), "987956912", 1, "As Crônicas de Gelo e Fogo - A Tormenta de Espadas"));
        this.tabela.add(new Livro(4, "", LocalDate.now(), "987935941", 1, "As Crônicas de Gelo e Fogo - O Festim dos Corvos"));
        this.tabela.add(new Livro(5, "", LocalDate.now(), "987943915", 1, "As Crônicas de Gelo e Fogo - A Dança dos Dragões"));
        this.tabela.add(new Livro(6, "", LocalDate.now(), "987916943", 1, "As Crônicas de Gelo e Fogo - Os Ventos do Inverno"));
        this.tabela.add(new Livro(7, "", LocalDate.now(), "987955922", 1, "As Crônicas de Gelo e Fogo - Um Sonho de Primavera"));

        this.tabela.add(new Livro(8, "", LocalDate.now(), "789746732", 2, "O Hobbit"));
        this.tabela.add(new Livro(9, "", LocalDate.now(), "789754712", 2, "O Senhor dos Anéis - A Sociedade do Anel"));
        this.tabela.add(new Livro(10, "", LocalDate.now(), "789765732", 2, "O Senhor dos Anéis - As Duas Torres"));
        this.tabela.add(new Livro(11, "", LocalDate.now(), "789755722", 2, "O Senhor dos Anéis - O Retorno do Rei"));
        this.tabela.add(new Livro(12, "", LocalDate.now(), "789746741", 2, "O Silmarillion"));

        this.tabela.add(new Livro(13, "", LocalDate.now(), "888486183", 3, "Harry Potter e a Pedra Filosofal"));
        this.tabela.add(new Livro(14, "", LocalDate.now(), "888585282", 3, "Harry Potter e a Câmara Secreta"));
        this.tabela.add(new Livro(15, "", LocalDate.now(), "888486281", 3, "Harry Potter e o Prisioneiro de Azkaban"));
        this.tabela.add(new Livro(16, "", LocalDate.now(), "888846811", 3, "Harry Potter e o Cálice de Fogo"));
        this.tabela.add(new Livro(17, "", LocalDate.now(), "888684382", 3, "Harry Potter e a Ordem da Fênix"));
        this.tabela.add(new Livro(18, "", LocalDate.now(), "888884821", 3, "Harry Potter e o Enigma do Príncipe"));
        this.tabela.add(new Livro(19, "", LocalDate.now(), "888448188", 3, "Harry Potter e as Relíquias da Morte"));
    }
}
