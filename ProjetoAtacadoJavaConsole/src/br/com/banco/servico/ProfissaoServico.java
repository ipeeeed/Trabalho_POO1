package br.com.banco.servico;

import java.util.List;
import br.com.banco.dominio.Profissao;
import br.com.banco.repositorio.ProfissaoRepositorio;

public class ProfissaoServico extends BaseServico<Profissao> {

    public ProfissaoServico() {
        this.repositorio = new ProfissaoRepositorio();
    }

    @Override
    public Profissao Criar(Profissao obj) {
        return this.repositorio.Create(obj);
    }

    @Override
    public Profissao Ler(int chave) {
        return this.repositorio.Read(chave);
    }

    @Override
    public List<Profissao> Ler() {
        return this.repositorio.Read();
    }

    @Override
    public Profissao Atualiza(Profissao obj) {
        return this.repositorio.Update(obj);
    }

    @Override
    public Profissao Deletar(int chave) {
        return this.repositorio.Delete(chave);
    }
}
