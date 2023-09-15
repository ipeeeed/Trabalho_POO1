package br.com.banco.teste;

import java.time.LocalDate;
import java.util.List;
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
        InstituicaoBancaria ib = new InstituicaoBancaria(2, "C7Banco", LocalDate.now(), true, 101, "www.c7.com.br");
        InstituicaoBancaria novo = this.servico.Criar(ib);
        System.out.println(novo.toString());
        return novo.getCodigo();
    }

    @Override
    protected void TestarLeitura(int chave) {
        InstituicaoBancaria ib = this.servico.Ler(chave);
        System.out.println(ib.toString());
    }

    @Override
    protected void TestarLeituraVarios() {
        List<InstituicaoBancaria> lista = this.servico.Ler();
        for (InstituicaoBancaria ib : lista) {
            System.out.println(ib.toString());
        }
    }

    @Override
    protected void TestarAlteracao(int chave) {
        InstituicaoBancaria antigo = this.servico.Ler(chave);
        antigo.setDescricao("Bradescada");
        InstituicaoBancaria alterada = this.servico.Atualiza(antigo);
        System.out.println(alterada.toString());
    }

    @Override
    protected void TestarExclusao(int chave) {
        InstituicaoBancaria alvo = this.servico.Ler(chave);
        InstituicaoBancaria excluido = this.servico.Deletar(alvo.getCodigo());
        System.out.println(excluido.toString());
    }

}