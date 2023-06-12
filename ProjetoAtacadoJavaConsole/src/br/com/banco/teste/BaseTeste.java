package br.com.banco.teste;

import br.com.banco.servico.InstituicaoBancariaServico;

public abstract class BaseTeste<TTeste> implements IBaseTeste<TTeste> {
    protected InstituicaoBancariaServico servico;

    public BaseTeste() {
    }

    protected abstract int TestarCriacao();
    protected abstract void TestarLeitura(int chave);
    protected abstract void TestarLeituraVarios();
    protected abstract void TestarAlteracao(int chave);
    protected abstract void TestarExclusao(int chave);
}
