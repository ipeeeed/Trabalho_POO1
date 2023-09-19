package br.com.bases;

public abstract class BaseServico<TServico> implements IBaseServico<TServico> {
    protected BaseRepositorio<TServico> repositorio;

    public BaseServico() {
    }
}
