package br.com.atacado.repositorio;

import br.com.atacado.dominio.Produto;
import br.com.atacado.fakeDB.ProdutoFakeDB;

public class ProdutoRepositorio extends BaseRepositorio<Produto> {
    
    public ProdutoRepositorio() {
        this.tabela = new ProdutoFakeDB().getTabela();
    }

    @Override
    public Produto Create(Produto obj) {
        int chave = 0;
        if (this.tabela.size() == 0) {
            chave++;
        } else {
            int tamanho = this.tabela.size();
            chave = this.tabela.get(tamanho - 1).getCodigo() + 1;
        }
        obj.setCodigo(chave);
        this.tabela.add(obj);
        return obj;
    }

    @Override
    public Produto Read(int chave) {
        Produto res = new Produto();
        for (Produto tupla : tabela) {
            if (tupla.getCodigo() == chave) {
                res = tupla;
                break;
            } else {
                res = null;
            }
        }
        return res;
    }

    @Override
    public Produto Update(Produto obj) {
        Produto alteracao = this.Read(obj.getCodigo());
        if (alteracao != null) {
            alteracao.setDescricao(obj.getDescricao());
        }
        return alteracao;
    }
}
