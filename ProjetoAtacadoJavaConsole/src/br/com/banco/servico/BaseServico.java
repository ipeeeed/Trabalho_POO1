package br.com.banco.servico;

import br.com.banco.repositorio.BaseRepositorio;

public abstract class BaseServico<TService> implements IBaseServico<TService> {
    protected BaseRepositorio<TService> repositorio;

    public BaseServico() {
    }
}
