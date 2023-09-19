package br.com.atacado.servico;

import java.util.List;
import br.com.atacado.dominio.Categoria;
import br.com.atacado.repositorio.CategoriaRepositorio;
import br.com.bases.BaseServico;

public class CategoriaServico extends BaseServico<Categoria> {

    public CategoriaServico() {
        this.repositorio = new CategoriaRepositorio();
    }

    @Override
    public Categoria Criar(Categoria obj) {
        return this.repositorio.Create(obj);
    }

    @Override
    public Categoria Ler(int chave) {
        return this.repositorio.Read(chave);
    }

    @Override
    public List<Categoria> Ler() {
        return this.repositorio.Read();
    }

    @Override
    public Categoria Atualizar(Categoria obj) {
        return this.repositorio.Update(obj);
    }

    @Override
    public Categoria Deletar(int chave) {
        return this.repositorio.Delete(chave);
    }
}
