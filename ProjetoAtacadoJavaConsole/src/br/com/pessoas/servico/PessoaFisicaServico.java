package br.com.pessoas.servico;

import java.util.List;
import br.com.pessoas.dominio.PessoaFisica;
import br.com.pessoas.repositorio.PessoaFisicaRepositorio;

public class PessoaFisicaServico extends BaseServico<PessoaFisica>{
    public PessoaFisicaServico() {
        this.repositorio = new PessoaFisicaRepositorio();
    }

    @Override
    public PessoaFisica Criar(PessoaFisica obj) {
        return this.repositorio.Create(obj);
    }

    @Override
    public PessoaFisica Ler(int chave) {
        return this.repositorio.Read(chave);
    }

    @Override
    public List<PessoaFisica> Ler() {
        return this.repositorio.Read();
    }

    @Override
    public PessoaFisica Atualizar(PessoaFisica obj) {
        return this.repositorio.Update(obj);
    }

    @Override
    public PessoaFisica Deletar(int chave) {
        return this.repositorio.Delete(chave);
    }    
}
