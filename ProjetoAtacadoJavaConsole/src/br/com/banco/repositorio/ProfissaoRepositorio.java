package br.com.banco.repositorio;

import br.com.banco.dominio.Profissao;
import br.com.banco.fakeDB.ProfissaoFakeDB;
import br.com.bases.BaseRepositorio;

public class ProfissaoRepositorio extends BaseRepositorio<Profissao> {
    public ProfissaoRepositorio() {
        this.tabela = new ProfissaoFakeDB().getTabela();
    }

    @Override
    public Profissao Create(Profissao obj) {
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
    public Profissao Read(int chave) {
        Profissao profissao = new Profissao();
        for (Profissao tupla : tabela) {
            if (tupla.getCodigo() == chave) {
                profissao = tupla;
                break;
            } else {
                profissao = null;
            }
        }
        return profissao;
    }

    @Override
    public Profissao Update(Profissao obj) {
        Profissao alteracao = this.Read(obj.getCodigo());
        if (alteracao != null) {
            alteracao.setDescricao(obj.getDescricao());
        }
        return alteracao;
    }
}
