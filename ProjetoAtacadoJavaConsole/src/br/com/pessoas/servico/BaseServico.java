package br.com.pessoas.servico;

import br.com.pessoas.repositorio.BaseRepositorio;

public abstract class BaseServico<TService> implements IBaseServico<TService> {
    protected BaseRepositorio<TService> repositorio;

    public BaseServico() {
    }
}
