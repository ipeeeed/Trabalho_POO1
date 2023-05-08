package br.com.atacado.fakeDB;

import java.time.LocalDate;

import br.com.atacado.dominio.Categoria;

public class CategoriaFakeDB extends BaseFakeDB<Categoria> {

    @Override
    public void AutoFill() {
        this.tabela.add(new Categoria(1, "Alimento Infantil", LocalDate.now()));
        this.tabela.add(new Categoria(2, "Suplementos", LocalDate.now()));
        this.tabela.add(new Categoria(3, "Bebidas", LocalDate.now()));
        this.tabela.add(new Categoria(4, "Biscoitos, Bolos e Bolachas", LocalDate.now()));
        this.tabela.add(new Categoria(5, "Carnes", LocalDate.now()));
        this.tabela.add(new Categoria(6, "Congelados", LocalDate.now()));
        this.tabela.add(new Categoria(7, "Conservas", LocalDate.now()));
        this.tabela.add(new Categoria(8, "Doces, Balas, Chocolates e Cia", LocalDate.now()));
        this.tabela.add(new Categoria(9, "Farinhas, Cereais e Complementos", LocalDate.now()));
        this.tabela.add(new Categoria(10, "Fast-Food, Aperitivos e Petiscos", LocalDate.now()));
        this.tabela.add(new Categoria(11, "Frios e Embutidos", LocalDate.now()));
        this.tabela.add(new Categoria(12, "Frutas", LocalDate.now()));
        this.tabela.add(new Categoria(13, "Legumes, Verduras e Grãos", LocalDate.now()));
        this.tabela.add(new Categoria(14, "Massas", LocalDate.now()));
        this.tabela.add(new Categoria(15, "Molhos, Caldos e Condimentos", LocalDate.now()));
        this.tabela.add(new Categoria(16, "Ovos, Leite, Queijo e Cia", LocalDate.now()));
        this.tabela.add(new Categoria(17, "Pães", LocalDate.now()));
        this.tabela.add(new Categoria(18, "Sopas & Cremes", LocalDate.now()));
        this.tabela.add(new Categoria(19, "Diversos", LocalDate.now()));
    }
}