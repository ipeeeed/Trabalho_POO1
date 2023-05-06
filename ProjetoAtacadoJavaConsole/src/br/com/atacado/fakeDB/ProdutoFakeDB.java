package br.com.atacado.fakeDB;

import java.time.LocalDate;

import br.com.atacado.dominio.Produto;

public class ProdutoFakeDB extends BaseFakeDB<Produto> {

    public void AutoFill() {
        this.tabela.add(new Produto(1, 2, "Integral", 300, LocalDate.now()));
        this.tabela.add(new Produto(2, 5, "Zero", 300, null));
        this.tabela.add(new Produto(3, 5, "Light", 300, LocalDate.now()));
        this.tabela.add(new Produto(4, 6, "Morango", 300, LocalDate.now()));
        this.tabela.add(new Produto(5, 6, "Uva", 300, LocalDate.now()));
        this.tabela.add(new Produto(6, 7, "Limão", 300, LocalDate.now()));
        this.tabela.add(new Produto(7, 8, "Banana", 300, LocalDate.now()));
        this.tabela.add(new Produto(8, 2, "Desnatado", 300, LocalDate.now()));
        this.tabela.add(new Produto(9, 7, "Chocolate", 300, LocalDate.now()));
        this.tabela.add(new Produto(10, 5, "Café", 300, LocalDate.now()));
    }

}
