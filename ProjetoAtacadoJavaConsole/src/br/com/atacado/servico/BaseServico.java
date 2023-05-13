package br.com.atacado.servico;

import br.com.atacado.repositorio.BaseRepositorio;

public abstract class BaseServico<TDado> implements IBaseServico<TDado> {
    protected BaseRepositorio<TDado> repositorio;

    public BaseServico() {

    }
}
