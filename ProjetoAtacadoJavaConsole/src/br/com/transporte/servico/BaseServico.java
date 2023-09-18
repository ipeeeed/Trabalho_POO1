package br.com.transporte.servico;

import br.com.transporte.repositorio.BaseRepositorio;

public abstract class BaseServico<TService> implements IBaseServico<TService> {
    protected BaseRepositorio<TService> repositorio;

    public BaseServico() {
    }
}
