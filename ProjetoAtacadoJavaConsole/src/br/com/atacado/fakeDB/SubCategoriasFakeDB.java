package br.com.atacado.fakeDB;

import java.time.LocalDate;

import br.com.atacado.dominio.Subcategoria;

public class SubCategoriasFakeDB extends BaseFakeDB<Subcategoria> {

    @Override
    public void AutoFill() {
        this.tabela.add(new Subcategoria(1, 1, "Papinha de bebe", LocalDate.now()));
        this.tabela.add(new Subcategoria(2, 1, "Leite", LocalDate.now()));
        this.tabela.add(new Subcategoria(3, 2, "Vitamina", LocalDate.now()));
        this.tabela.add(new Subcategoria(4, 2, "Way", LocalDate.now()));
        this.tabela.add(new Subcategoria(5, 3, "Coca-cola", LocalDate.now()));
        this.tabela.add(new Subcategoria(6, 3, "Suco", LocalDate.now()));
        this.tabela.add(new Subcategoria(7, 4, "Bolo", LocalDate.now()));
        this.tabela.add(new Subcategoria(8, 4, "Biscoito", LocalDate.now()));
        this.tabela.add(new Subcategoria(9, 5, "Picanha", LocalDate.now()));
    }

}
