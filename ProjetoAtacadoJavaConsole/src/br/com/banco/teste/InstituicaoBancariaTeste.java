package br.com.banco.teste;

import java.time.LocalDate;
import java.util.List;
import br.com.banco.dominio.InstituicaoBancaria;
import br.com.banco.servico.InstituicaoBancariaServico;
import br.com.bases.BaseTeste;

public class InstituicaoBancariaTeste extends BaseTeste<InstituicaoBancaria> {

    public InstituicaoBancariaTeste() {
        this.servico = new InstituicaoBancariaServico();
    }

    @Override
    public void Executar() {
        System.out.println("\n");
        int valorChave = this.TestarCriacao();
        this.TestarAlteracao(valorChave);
        this.TestarLeitura(valorChave);
        this.TestarExclusao(valorChave);
        // this.TestarLeituraVarios();
    }

    @Override
    protected int TestarCriacao() {
        System.out.println("Agora testando CRIAÇÃO: ");
        InstituicaoBancaria ib = new InstituicaoBancaria(2, "C7Banco", LocalDate.now(), true, 101, "www.c7.com.br");
        InstituicaoBancaria novo = this.servico.Criar(ib);
        System.out.println(novo.toString());
        return novo.getCodigo();
    }

    @Override
    protected void TestarLeitura(int chave) {
        System.out.println("Agora testando LEITURA: ");
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
        System.out.println("Agora testando ALTERAÇÃO: ");
        InstituicaoBancaria antigo = this.servico.Ler(chave);
        antigo.setDescricao("Bradescada");
        InstituicaoBancaria alterada = this.servico.Atualizar(antigo);
        System.out.println(alterada.toString());
    }

    @Override
    protected void TestarExclusao(int chave) {
        System.out.println("Agora testando EXCLUSÃO: ");
        InstituicaoBancaria alvo = this.servico.Ler(chave);
        InstituicaoBancaria excluido = this.servico.Deletar(alvo.getCodigo());
        System.out.println(excluido.toString());
    }
}