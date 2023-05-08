package br.com.atacado.teste;

import java.util.List;
import br.com.atacado.dominio.Subcategoria;
import br.com.atacado.repositorio.SubcategoriaRepositorio;

public class TesteSubcategoriaRepositorio {
    
    private SubcategoriaRepositorio repositorioSubcategoria;

    public TesteSubcategoriaRepositorio() {
        this.repositorioSubcategoria = new SubcategoriaRepositorio();
    }

    public void Executar() {
        List<Subcategoria> subCategorias = this.repositorioSubcategoria.Read();
        for (Subcategoria tupla : subCategorias) {
            System.out.println(tupla.toString());
        }
    }
}
