package br.com.biblioteca.repositorio;

import br.com.bases.BaseRepositorio;
import br.com.biblioteca.dominio.Livro;
import br.com.biblioteca.fakeDB.LivroFakeDB;

public class LivroRepositorio extends BaseRepositorio<Livro> {
    public LivroRepositorio() {
        this.tabela = new LivroFakeDB().getTabela();
    }

    @Override
    public Livro Create(Livro obj) {
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
    public Livro Read(int chave) {
        Livro livro = new Livro();
        for (Livro tupla : tabela) {
            if (tupla.getCodigo() == chave) {
                livro = tupla;
                break;
            } else {
                livro = null;
            }
        }
        return livro;
    }

    @Override
    public Livro Update(Livro obj) {
        Livro alteracao = this.Read(obj.getCodigo());
        if (alteracao != null) {
            alteracao.setDescricao(obj.getDescricao());
        }
        return alteracao;
    }
}
