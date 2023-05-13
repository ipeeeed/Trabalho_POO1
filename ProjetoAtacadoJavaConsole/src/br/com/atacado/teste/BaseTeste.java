package br.com.atacado.teste;

import br.com.atacado.servico.BaseServico;

public abstract class BaseTeste<TModelo> implements IBaseTeste<TModelo> {
    protected BaseServico<TModelo> servico;

    public BaseTeste() {
    }

    protected abstract int TestarCriacao();

    protected abstract void TestarLeitura(int chave);

    protected abstract void TestarLeituraVarios();

    protected abstract void TestarAlteracao(int chave);

    protected abstract void TestarExclusao(int chave);

}
