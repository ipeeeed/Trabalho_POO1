package br.com.atacado.repositorio;

import br.com.atacado.dominio.Subcategoria;
import br.com.atacado.fakeDB.SubcategoriaFakeDB;

public class SubcategoriaRepositorio extends BaseRepositorio<Subcategoria> {

    public SubcategoriaRepositorio() {
        this.tabela = new SubcategoriaFakeDB().getTabela();
    }

    @Override
    public Subcategoria Create(Subcategoria obj) {
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
    public Subcategoria Read(int chave) {
        Subcategoria res = new Subcategoria();
        for (Subcategoria tupla : tabela) {
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
    public Subcategoria Update(Subcategoria obj) {
        Subcategoria alteracao = this.Read(obj.getCodigo());
        if (alteracao != null) {
            alteracao.setDescricao(obj.getDescricao());
        }
        return alteracao;
    }

}
