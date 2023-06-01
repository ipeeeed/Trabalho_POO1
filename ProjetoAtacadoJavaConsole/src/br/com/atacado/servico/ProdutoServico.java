package br.com.atacado.servico;

import java.util.List;
import br.com.atacado.dominio.Produto;
import br.com.atacado.repositorio.ProdutoRepositorio;

public class ProdutoServico extends BaseServico<Produto> {
    public ProdutoServico() {
        this.repositorio = new ProdutoRepositorio();
    }

    @Override
    public Produto Criar(Produto obj) {
        return this.repositorio.Create(obj);
    }

    @Override
    public Produto Ler(int chave) {
        return this.repositorio.Read(chave);
    }

    @Override
    public List<Produto> Ler() {
        return this.repositorio.Read();
    }

    @Override
    public Produto Atualizar(Produto obj) {
        return this.repositorio.Update(obj);
    }

    @Override
    public Produto Deletar(int chave) {
        return this.repositorio.Delete(chave);
    }
    
}
