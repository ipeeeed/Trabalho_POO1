package br.com.atacado.teste;

import java.util.List;
import br.com.atacado.dominio.Categoria;
import br.com.atacado.repositorio.CategoriaRepositorio;

public class TesteCategoriaRepositorio {
    private CategoriaRepositorio repositorioCategoria;

    public TesteCategoriaRepositorio() {
        this.repositorioCategoria = new CategoriaRepositorio();
    }

    public void Executar() {
        List<Categoria> categorias = this.repositorioCategoria.Read();
        for (Categoria tupla : categorias) {
            System.out.println(tupla.toString());
        }
    }
}