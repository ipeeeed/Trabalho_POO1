package br.com.pessoas.repositorio;

import br.com.bases.BaseRepositorio;
import br.com.pessoas.dominio.Funcionario;
import br.com.pessoas.fakeDB.FuncionarioFakeDB;

public class FuncionarioRepositorio extends BaseRepositorio<Funcionario> {
    public FuncionarioRepositorio() {
        this.tabela = new FuncionarioFakeDB().getTabela();
    }

    @Override
    public Funcionario Create(Funcionario obj) {
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
    public Funcionario Read(int chave) {
        Funcionario funcionario = new Funcionario();
        for (Funcionario tupla : tabela) {
            if (tupla.getCodigo() == chave) {
                funcionario = tupla;
                break;
            } else {
                funcionario = null;
            }
        }
        return funcionario;
    }

    @Override
    public Funcionario Update(Funcionario obj) {
        Funcionario alteracao = this.Read(obj.getCodigo());
        if (alteracao != null) {
            alteracao.setLogin(obj.getLogin());
            alteracao.setSenha(obj.getSenha());
        }
        return alteracao;
    }    
}
