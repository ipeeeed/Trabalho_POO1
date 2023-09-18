package br.com.biblioteca.servico;

import br.com.biblioteca.repositorio.BaseRepositorio;

public abstract class BaseServico<TService> implements IBaseServico<TService> {
    protected BaseRepositorio<TService> repositorio;

    public BaseServico() {
    }
}
