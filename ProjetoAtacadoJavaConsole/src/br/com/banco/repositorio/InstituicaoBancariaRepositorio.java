package br.com.banco.repositorio;

import br.com.banco.dominio.InstituicaoBancaria;
import br.com.banco.fakeDB.InstituicaoBancariaFakeDB;

public class InstituicaoBancariaRepositorio extends BaseRepositorio<InstituicaoBancaria> {
    public InstituicaoBancariaRepositorio() {
        this.tabela = new InstituicaoBancariaFakeDB().getTabela();
    }

    @Override
    public InstituicaoBancaria Create(InstituicaoBancaria obj) {
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
    public InstituicaoBancaria Read(int chave) {
        InstituicaoBancaria instituicaoBancaria = new InstituicaoBancaria();
        for (InstituicaoBancaria tupla : tabela) {
            if (tupla.getCodigo() == chave) {
                instituicaoBancaria = tupla;
                break;
            } else {
                instituicaoBancaria = null;
            }
        }
        return instituicaoBancaria;
    }

    @Override
    public InstituicaoBancaria Update(InstituicaoBancaria obj) {
        InstituicaoBancaria alteracao = this.Read(obj.getCodigo());
        if (alteracao != null) {
            alteracao.setDescricao(obj.getDescricao());
        }
        return alteracao;
    }
}
