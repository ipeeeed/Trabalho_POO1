package br.com.atacado.teste;

import java.util.List;
import br.com.atacado.dominio.Produto;
import br.com.atacado.repositorio.ProdutoRepositorio;

public class TesteProdutoRepositorio {
    
    private ProdutoRepositorio repositorioProduto;

    public TesteProdutoRepositorio() {
        this.repositorioProduto = new ProdutoRepositorio();
    }

    public void Executar() {
        List<Produto> produtos = this.repositorioProduto.Read();
        for (Produto tupla : produtos) {
            System.out.println(tupla.toString());
        }
    }
}
