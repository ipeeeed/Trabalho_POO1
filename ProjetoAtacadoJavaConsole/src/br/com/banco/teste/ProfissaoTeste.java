package br.com.banco.teste;

import br.com.banco.dominio.Profissao;
import br.com.banco.servico.ProfissaoServico;

public class ProfissaoTeste extends BaseTeste<Profissao> {

    public ProfissaoTeste() {
        this.servico = new ProfissaoServico();
    }

    @Override
    public void Executar() {

    }

    @Override
    protected int TestarCriacao() {
        return 0;
    }

    @Override
    protected void TestarLeitura(int chave) {

    }

    @Override
    protected void TestarLeituraVarios() {

    }

    @Override
    protected void TestarAlteracao(int chave) {

    }

    @Override
    protected void TestarExclusao(int chave) {

    }

}
