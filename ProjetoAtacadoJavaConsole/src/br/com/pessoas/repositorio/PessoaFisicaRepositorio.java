package br.com.pessoas.repositorio;

import br.com.bases.BaseRepositorio;
import br.com.pessoas.dominio.PessoaFisica;
import br.com.pessoas.fakeDB.PessoaFisicaFakeDB;

public class PessoaFisicaRepositorio extends BaseRepositorio<PessoaFisica> {
    public PessoaFisicaRepositorio() {
        this.tabela = new PessoaFisicaFakeDB().getTabela();
    }

    @Override
    public PessoaFisica Create(PessoaFisica obj) {
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
    public PessoaFisica Read(int chave) {
        PessoaFisica pessoaFisica = new PessoaFisica();
        for (PessoaFisica tupla : tabela) {
            if (tupla.getCodigo() == chave) {
                pessoaFisica = tupla;
            } else {
                pessoaFisica = null;
            }
        }
        return pessoaFisica;
    }

    @Override
    public PessoaFisica Update(PessoaFisica obj) {
        PessoaFisica alteracao = this.Read(obj.getCodigo());
        if (alteracao != null) {
            alteracao.setEmail("Novo email");
        }
        return alteracao;
    }    
}
