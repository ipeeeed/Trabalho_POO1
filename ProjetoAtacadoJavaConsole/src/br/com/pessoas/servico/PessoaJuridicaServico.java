package br.com.pessoas.servico;

import java.util.List;

import br.com.bases.BaseServico;
import br.com.pessoas.dominio.PessoaJuridica;
import br.com.pessoas.repositorio.PessoaJuridicaRepositorio;

public class PessoaJuridicaServico extends BaseServico<PessoaJuridica> {
    public PessoaJuridicaServico() {
        this.repositorio = new PessoaJuridicaRepositorio();
    }

    @Override
    public PessoaJuridica Criar(PessoaJuridica obj) {
        return this.repositorio.Create(obj);
    }

    @Override
    public PessoaJuridica Ler(int chave) {
        return this.repositorio.Read(chave);
    }

    @Override
    public List<PessoaJuridica> Ler() {
        return this.repositorio.Read();
    }

    @Override
    public PessoaJuridica Atualizar(PessoaJuridica obj) {
        return this.repositorio.Update(obj);
    }

    @Override
    public PessoaJuridica Deletar(int chave) {
        return this.repositorio.Delete(chave);
    }
}
