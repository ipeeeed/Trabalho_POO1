package br.com.biblioteca.repositorio;

import br.com.bases.BaseRepositorio;
import br.com.biblioteca.dominio.Autor;
import br.com.biblioteca.fakeDB.AutorFakeDB;

public class AutorRepositorio extends BaseRepositorio<Autor> {
    public AutorRepositorio() {
        this.tabela = new AutorFakeDB().getTabela();
    }

    @Override
    public Autor Create(Autor obj) {
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
    public Autor Read(int chave) {
        Autor autor = new Autor();
        for (Autor tupla : tabela) {
            if (tupla.getCodigo() == chave) {
                autor = tupla;
                break;
            } else {
                autor = null;
            }
        }
        return autor;
    }

    @Override
    public Autor Update(Autor obj) {
        Autor alteracao = this.Read(obj.getCodigo());
        if (alteracao != null) {
            alteracao.setDescricao(obj.getDescricao());
        }
        return alteracao;
    }
}
