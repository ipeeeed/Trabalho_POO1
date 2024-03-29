package br.com.pessoas.repositorio;

import br.com.bases.BaseRepositorio;
import br.com.pessoas.dominio.PessoaJuridica;
import br.com.pessoas.fakeDB.PessoaJuridicaFakeDB;

public class PessoaJuridicaRepositorio extends BaseRepositorio<PessoaJuridica> {
    public PessoaJuridicaRepositorio() {
        this.tabela = new PessoaJuridicaFakeDB().getTabela();
    }

    @Override
    public PessoaJuridica Create(PessoaJuridica obj) {
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
    public PessoaJuridica Read(int chave) {
        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        for (PessoaJuridica tupla : tabela) {
            if (tupla.getCodigo() == chave) {
                pessoaJuridica = tupla;
                break;
            } else {
                pessoaJuridica = null;
            }
        }
        return pessoaJuridica;
    }

    @Override
    public PessoaJuridica Update(PessoaJuridica obj) {
        PessoaJuridica alteracao = this.Read(obj.getCodigo());
        if (alteracao != null) {
            alteracao.setEmail("Novo Email");
        }
        return alteracao;
    }
}
