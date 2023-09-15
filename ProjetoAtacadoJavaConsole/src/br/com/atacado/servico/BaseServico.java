package br.com.atacado.servico;

import br.com.atacado.repositorio.BaseRepositorio;

public abstract class BaseServico<TService> implements IBaseServico<TService> {
    protected BaseRepositorio<TService> repositorio;

    public BaseServico() {
    }
}
