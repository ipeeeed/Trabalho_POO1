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
    }
}
