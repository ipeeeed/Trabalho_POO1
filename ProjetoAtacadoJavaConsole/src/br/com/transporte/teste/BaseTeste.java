package br.com.transporte.teste;

import br.com.transporte.servico.BaseServico;

public abstract class BaseTeste<TTeste> implements IBaseTeste<TTeste> {
    protected BaseServico<TTeste> servico;

    public BaseTeste() {
    }

    protected abstract int TestarCriacao();
    protected abstract void TestarLeitura(int chave);
    protected abstract void TestarLeituraVarios();
    protected abstract void TestarAlteracao(int chave);
    protected abstract void TestarExclusao(int chave);
}
