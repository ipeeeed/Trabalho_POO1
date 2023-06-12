package br.com.banco.teste;

import br.com.banco.dominio.InstituicaoBancaria;
import br.com.banco.servico.InstituicaoBancariaServico;

public class InstituicaoBancariaTeste extends BaseTeste<InstituicaoBancaria> {

    public InstituicaoBancariaTeste() {
        this.servico = new InstituicaoBancariaServico();
    }

    @Override
    public void Executar() {
        int valorChave = this.TestarCriacao();
        this.TestarAlteracao(valorChave);
        this.TestarExclusao(valorChave);
    }

    @Override
    protected int TestarCriacao() {
        
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